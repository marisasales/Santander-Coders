package com.letscode.converter;

import com.letscode.converter.util.Input;
import com.letscode.converter.util.Output;

public class Main {

  public static void main(String[] args) {
    /* Escreva um programa que, com base em uma temperatura em graus celsius,
    converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F).
    Considere a conversão de 18 ºC e a precisão de duas casas decimais. */
    float celsius = Input.inputCelsius();

    Output.printFahrenheit(celsius);
    Output.printKelvin(celsius);
    Output.printReaumur(celsius);
    Output.printRankine(celsius);
  }
}
