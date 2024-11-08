package org.example.code;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static java.lang.System.exit;

public class LoginController {
    public void loginUser(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/code/choice-view.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Choice View");
            stage.setScene(new Scene(root));
            stage.show();
            // Close the current window
            ((Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow()).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close(ActionEvent actionEvent) {
        exit(0);
    }
}