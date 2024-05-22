/**
 * @author Cristyan Morales Acevedo
 * @desc Lógica del programa, contiene el método conversor
 */
package com.example.temperaturafx.temperaturafxModel;

public class TemperaturaConverter {
    /**
     * Funcion base del programa, se encarga de hacer la conversión
     * @param celsius
     * @return valor de celsius en fahrenheit
     */
    public static double convertCelsiusToFahrenheit (double celsius){
        return (celsius * 9 / 5)+32;
    }
}
