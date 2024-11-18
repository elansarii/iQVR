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

    @FXML
    private void checkBills() {
        String currentOwnerQid = currentOwnerQidField.getText();
        boolean hasOutstandingBills = checkOutstandingBills(currentOwnerQid);

        if (hasOutstandingBills) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Outstanding Bills");
            alert.setHeaderText(null);
            alert.setContentText("You have outstanding bills. Please pay them before proceeding.");
            alert.showAndWait();

            // Terminate the session
            Stage stage = (Stage) checkBillsButton.getScene().getWindow();
            stage.close();
        } else {
            System.out.println("No outstanding bills for QID: " + currentOwnerQid);
        }
    }

    private boolean checkOutstandingBills(String qid) {
        // Add logic to check if there are outstanding bills for the given QID
        // This is a placeholder implementation
        return true; // Assume there are outstanding bills for demonstration purposes
    }

    @FXML
    private void handleConfirmTransfer() {
        String currentOwnerQid = currentOwnerQidField.getText();
        String currentOwnerName = currentOwnerNameField.getText();
        String currentOwnerVin = currentOwnerVinField.getText();
        String newOwnerName = newOwnerNameField.getText();
        String newOwnerQid = newOwnerQidField.getText();
        String newOwnerPhone = newOwnerPhoneField.getText();

        System.out.println("Transfer confirmed from " + currentOwnerName + " to " + newOwnerName);
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