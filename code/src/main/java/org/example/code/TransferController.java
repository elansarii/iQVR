package org.example.code;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class TransferController {

    @FXML
    private TextField currentOwnerQidField;

    @FXML
    private TextField currentOwnerNameField;

    @FXML
    private TextField currentOwnerVinField;

    @FXML
    private TextField newOwnerNameField;

    @FXML
    private TextField newOwnerQidField;

    @FXML
    private TextField newOwnerPhoneField;

    @FXML
    private Button confirmButton;

    @FXML
    private Button cancelButton;

    @FXML
    private Button checkBillsButton;

    // Add a boolean flag to track if bills have been checked
    private boolean billsChecked = false;

    // Initialize method to disable the Confirm button initially
    @FXML
    public void initialize() {
        confirmButton.setDisable(true);
    }

    @FXML
    private void handleCheckBills() {
        String currentOwnerQid = currentOwnerQidField.getText();

        // Find the current owner based on QID
        Owner owner = findOwner(currentOwnerQid);
        if (owner == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Owner Not Found");
            alert.setContentText("No owner with QID: " + currentOwnerQid);
            alert.showAndWait();
            return;
        }

        boolean billsArePaid = owner.findOutstandingBills(owner.getQid());
        if (!billsArePaid) {
            // Owner has unpaid bills
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Unpaid Bills");
            alert.setContentText("You have unpaid bills");
            alert.showAndWait();
            return;
        }

        // Bills are checked and there are no unpaid bills
        billsChecked = true;
        confirmButton.setDisable(false); // Enable the Confirm Transfer button

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Bills Checked");
        alert.setHeaderText("All bills are paid");
        alert.setContentText("You can proceed with the transfer");
        alert.showAndWait();
    }

    @FXML
    private void handleConfirmTransfer() {
        // Check if bills have been checked before proceeding
        if (!billsChecked) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Bills Not Checked");
            alert.setContentText("Please check bills before confirming transfer.");
            alert.showAndWait();
            return;
        }

        Owner currentOwner = findOwner(currentOwnerQidField.getText());
        Owner newOwner = findOwner(newOwnerQidField.getText());
        String vin = currentOwnerVinField.getText();

        if (currentOwner == null || newOwner == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid Owner");
            alert.setContentText("Owner information not correct");
            alert.showAndWait();
            return;
        }

        // Proceed with the transfer
        currentOwner.transferOwner(newOwner, vin);

        // Optional: Reset the billsChecked flag and disable the Confirm button after transfer
        billsChecked = false;
        confirmButton.setDisable(true);
    }

    private Owner findOwner(String qid) {
        for (Owner o : iQVR.owners) {
            if (o.getQid().equals(qid)) {
                return o;
            }
        }
        return null;
    }

    @FXML
    private void handleCancel() {
        try {
            Parent choiceView = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/code/choice-view.fxml")));
            Scene choiceScene = new Scene(choiceView);
            Stage window = (Stage) cancelButton.getScene().getWindow();
            window.setScene(choiceScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
