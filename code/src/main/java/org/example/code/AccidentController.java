package org.example.code;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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