package org.example.code;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChoiceController {

    public void transferOwnership(ActionEvent actionEvent) {
        try {
            Parent transferView = FXMLLoader.load(getClass().getResource("/org/example/code/transfer-view.fxml"));
            Scene transferScene = new Scene(transferView);
            Stage window = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(transferScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reportAccident(ActionEvent actionEvent) {
        try {
            Parent reportView = FXMLLoader.load(getClass().getResource("/org/example/code/report-accident-view.fxml"));
            Scene reportScene = new Scene(reportView);
            Stage window = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(reportScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}