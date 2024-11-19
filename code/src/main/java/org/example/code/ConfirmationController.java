package org.example.code;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ConfirmationController {

    @FXML
    private Label confirmationMessage;

    @FXML
    private Button confirmButton;

    @FXML
    private Button cancelButton;

    private AccidentController accidentController;

    public void setAccidentController(AccidentController accidentController) {
        this.accidentController = accidentController;
    }

    public void setConfirmationMessage(String message) {
        confirmationMessage.setText(message);
    }

    @FXML
    private void handleConfirm() {
        accidentController.finalizeAccidentReport();
        Stage stage = (Stage) confirmButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void handleCancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}