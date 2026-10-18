module main.ejercicio1_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens main.ejercicio1_1 to javafx.fxml;
    exports main.ejercicio1_1;
}
