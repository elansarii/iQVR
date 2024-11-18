package org.example.code;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
        // Check if the current owner has any outstanding bills
        String currentOwnerQid = currentOwnerQidField.getText();
        // Add logic to check bills
        System.out.println("Checking bills for QID: " + currentOwnerQid);
    }

    @FXML
    private void handleConfirmTransfer() {
        // Handle the confirm transfer action
        String currentOwnerQid = currentOwnerQidField.getText();
        String currentOwnerName = currentOwnerNameField.getText();
        String currentOwnerVin = currentOwnerVinField.getText();
        String newOwnerName = newOwnerNameField.getText();
        String newOwnerQid = newOwnerQidField.getText();
        String newOwnerPhone = newOwnerPhoneField.getText();

        // Add your transfer logic here
        System.out.println("Transfer confirmed from " + currentOwnerName + " to " + newOwnerName);
    }

    @FXML
    private void handleCancel() {
        // Handle the cancel action
        System.out.println("Transfer cancelled");
    }
}