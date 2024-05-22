/**
 * @author Cristyan Morales Acevedo
 * @desc Clase y método principal (main) del programa
 */
package com.example.temperaturafx;

//Imports necesarios para el funcionamiento
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    /**
     * Método start que hereda de javafx.application.Application, permite el establecimiento de la ventana y los parámetros que la componen.
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/temperaturafx/temperaturafxView/TemperaturaConverterView.fxml")); //Se carga el documento XML que da las características gráficas del programa
        Scene scene = new Scene(fxmlLoader.load(),320,250); //Se establece la escena, se entrega el elemento anterior y se indican las dimensiones de la ventana H: 320px, V: 250px
        stage.setTitle("Conversor de Temperatura"); //Título de la ventana
        stage.setScene(scene); //se añade la escena al escenario
        stage.show(); //Se da la orden de enseñar el escenario
    }

    /**
     * Unica orden de ejecución del programa, método launch()
     * @param args
     */
    public static void main(String[] args) {launch();    }
}
