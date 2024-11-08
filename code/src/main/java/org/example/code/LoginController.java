package org.example.code;

import javafx.event.ActionEvent;

import static java.lang.System.exit;

public class LoginController {
    public void loginUser(ActionEvent actionEvent) {
        System.out.println("Admin logged in");
    }

    public void close(ActionEvent actionEvent) {
        exit(0);
    }
}