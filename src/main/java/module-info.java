module com.example.application {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.application to javafx.fxml;
    exports com.example.application;
}