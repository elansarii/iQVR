package org.example.code;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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