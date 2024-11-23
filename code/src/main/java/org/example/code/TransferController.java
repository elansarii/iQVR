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

    private boolean billsChecked = false;

    @FXML
    public void initialize() {
        confirmButton.setDisable(true);
    }

    @FXML
    private void handleCheckBills() {
        String currentOwnerQid = currentOwnerQidField.getText();

        Owner owner = findOwner(currentOwnerQid);
        if (owner == null) {
            showAlert("Error", "Owner Not Found", "No owner with QID: " + currentOwnerQid);
            return;
        }

        boolean billsArePaid = owner.findOutstandingBills(owner.getQid());
        if (!billsArePaid) {
            showAlert("Error", "Unpaid Bills", "You have unpaid bills");
            return;
        }

        billsChecked = true;
        confirmButton.setDisable(false);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Bills Checked");
        alert.setHeaderText("All bills are paid");
        alert.setContentText("You can proceed with the transfer");
        alert.showAndWait();
    }

    @FXML
    private void handleConfirmTransfer() {
        if (!billsChecked) {
            showAlert("Error", "Bills Not Checked", "Please check bills before confirming transfer.");
            return;
        }

        String currentOwnerVin = currentOwnerVinField.getText();
        String newOwnerPhone = newOwnerPhoneField.getText();

        if (currentOwnerVin == null || currentOwnerVin.trim().isEmpty()) {
            showAlert("Invalid Input", "Current Owner VIN cannot be empty.", "Please enter a valid VIN.");
            return;
        }

        // Validate New Owner Phone Number
        if (!isValidPhoneNumber(newOwnerPhone)) {
            showAlert("Invalid Input", "New Owner Phone Number must be a valid phone number.", "Please enter a valid phone number.");
            return;
        }

        Owner currentOwner = findOwner(currentOwnerQidField.getText());
        Owner newOwner = findOwner(newOwnerQidField.getText());
        String vin = currentOwnerVinField.getText();
        if (currentOwner == null || newOwner == null) {
            showAlert("Error", "Invalid Owner", "Owner information not correct");
            return;
        }

        currentOwner.transferOwner(newOwner, vin);

        billsChecked = false;
        confirmButton.setDisable(true);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Transfer Complete");
        alert.setHeaderText(null);
        alert.setContentText("The transfer has been successfully completed.");
        alert.showAndWait();

        handleCancel();
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

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.matches("\\d{8}");
    }

    private void showAlert(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}