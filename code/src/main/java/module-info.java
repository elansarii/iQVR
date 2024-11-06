module org.example.code {
    requires javafx.fxml;
    requires java.sql;
    requires atlantafx.base;


    opens org.example.code to javafx.fxml;
    exports org.example.code;
}