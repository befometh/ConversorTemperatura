/**
 * @author Cristyan Morales Acevedo
 * @desc Controlador, conecta la vista (parte visual del programa) con el modelo (parte lógica del programa)
 */
package com.example.temperaturafx.temperaturafxController;

//Lista de imports
import com.example.temperaturafx.temperaturafxModel.TemperaturaConverter;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TemperaturaConverterController {
    //creadores de los elementos lógicos
    @FXML
    private TextField textFieldCelsius;

    @FXML
    private Label labelFahrenheit;

    /**
     * Creador de la función del botón, conecta con el modelo para ejecutar la función del programa
     * celsius: valor de tipo doble que recibe del campo de texto central, a convertir
     * fahrenheit: valor de tipo doble que tomará el resultado de la función del modelo TemperaturaConverter
     */
    @FXML
    private void convertTemperatura(){
        try {
            double celsisus = Double.parseDouble(textFieldCelsius.getText()); //Recepción de datos ingresados por usuario
            double fahrenheit = TemperaturaConverter.convertCelsiusToFahrenheit(celsisus); //Llamada al método del modelo
            labelFahrenheit.setText("Grados Fahrenheit: "+ fahrenheit); //Muestra del resultado.
        }catch (NumberFormatException e){
            labelFahrenheit.setText("Por favor, ingresa un número válido."); //Se produce si se ingresa un valor inválido, como un caracter no numérico, por ejemplo.
        }
    }

}
