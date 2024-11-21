package org.example.code;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.Objects;

public class AccidentController {

    @FXML
    private TextField responsibleVehicleVINField;

    @FXML
    private TextField victimVehicleVINField;

    @FXML
    private TextField locationField;

    @FXML
    private TextField descriptionField;

    @FXML
    private Button confirmButton;

    @FXML
    private Button cancelButton;

    @FXML
    private void handleConfirmTransfer(ActionEvent actionEvent) {
        String responsibleVehicleVIN = responsibleVehicleVINField.getText();
        String victimVehicleVIN = victimVehicleVINField.getText();
        String location = locationField.getText();
        String description = descriptionField.getText();

        // Validate Responsible Vehicle VIN
        if (!isInteger(responsibleVehicleVIN)) {
            showAlert("Invalid Input", "Responsible Vehicle VIN must be an integer.");
            return;
        }

        // Validate Victim Vehicle VIN
        if (!isInteger(victimVehicleVIN)) {
            showAlert("Invalid Input", "Victim Vehicle VIN must be an integer.");
            return;
        }

        // Validate Location
        if (location == null || location.trim().isEmpty()) {
            showAlert("Invalid Input", "Location cannot be empty.");
            return;
        }

        // Validate Description
        if (description == null || description.trim().isEmpty()) {
            showAlert("Invalid Input", "Description cannot be empty.");
            return;
        }

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/code/confirmation-view.fxml"));
            Parent confirmationView = loader.load();

            ConfirmationController confirmationController = loader.getController();
            confirmationController.setAccidentController(this);
            confirmationController.setConfirmationMessage(
                    "Responsible Vehicle VIN: " + responsibleVehicleVIN + "\n" +
                            "Victim Vehicle VIN: " + victimVehicleVIN + "\n" +
                            "Location: " + location + "\n" +
                            "Description: " + description
            );

            Stage stage = new Stage();
            stage.setScene(new Scene(confirmationView));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isInteger(String value) {
        if (value == null) return false;
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }



    public void finalizeAccidentReport() {
        String responsibleVehicleVIN = responsibleVehicleVINField.getText();
        String victimVehicleVIN = victimVehicleVINField.getText();
        String location = locationField.getText();
        String description = descriptionField.getText();
        AccidentReport report=new AccidentReport(description,responsibleVehicleVIN,victimVehicleVIN,location);
        report.generateAccidentReport();
        report.sendReportToInsurance();
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