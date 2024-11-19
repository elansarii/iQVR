package org.example.code;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;
import java.util.Objects;


public class iQVR extends Application {
    public static ArrayList<Owner> owners = new ArrayList<>();
    public static ArrayList<Vehicle> vehicles = new ArrayList<>();
    public static ArrayList<Invoice> bills = new ArrayList<>();

    private double x = 0;
    private double y = 0;

    @Override
    public void start(Stage stage) throws Exception {
        owners= DataLoader.loadOwners();
        vehicles= DataLoader.loadVehicles();
        bills= DataLoader.loadInvoices();

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login-view.fxml")));

        Scene scene = new Scene(root);

        root.setOnMousePressed((MouseEvent event) ->{
            x = event.getSceneX();
            y = event.getSceneY();
        });

        root.setOnMouseDragged((MouseEvent event) ->{
            stage.setX(event.getScreenX() - x);
            stage.setY(event.getScreenY() - y);

            stage.setOpacity(.8);
        });

        root.setOnMouseReleased((MouseEvent event) ->{
            stage.setOpacity(1);
        });

        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}