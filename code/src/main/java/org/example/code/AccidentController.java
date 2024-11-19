
package org.example.code;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

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
        // Handle the confirm action
        String responsibleVehicleVIN = responsibleVehicleVINField.getText();
        String victimVehicleVIN = victimVehicleVINField.getText();
        String location = locationField.getText();
        String description = descriptionField.getText();

        // Add your accident report logic here
        System.out.println("Accident reported with details: " + description);
    }

    @FXML
    private void handleCancel(ActionEvent actionEvent) {
        // Handle the cancel action
        System.out.println("Accident report cancelled");
    }
}
