module org.example.code {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.code to javafx.fxml;
    exports org.example.code;
}