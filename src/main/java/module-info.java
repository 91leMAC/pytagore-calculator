module com.example.pytagorecalculator {

    // Dependecies for libraries
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.pytagorecalculator to javafx.fxml;
    exports com.example.pytagorecalculator;
}