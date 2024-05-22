/**
 * @mod Cristyan Morales Acevedo
 * Entrega la información a la máquina virtual para la ejecución
 */

module com.example.temperaturafx {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.temperaturafx to javafx.graphics;
    exports com.example.temperaturafx.temperaturafxController to javafx.fxml;
    opens com.example.temperaturafx.temperaturafxController;
}