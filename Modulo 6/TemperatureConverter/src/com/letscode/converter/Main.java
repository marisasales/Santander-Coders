package com.letscode.converter;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    /* Escreva um programa que, com base em uma temperatura em graus celsius,
    converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F).
    Considere a conversão de 18 ºC e a precisão de duas casas decimais. */

    Scanner input = new Scanner(System.in);
    System.out.print("Informe a temperatura em celsius: ");
    float celsius = input.nextFloat();

    final float FAHRENHEIT = (celsius * 1.8f) + 32;
    final float KELVIN = celsius + 273.15f;
    final float REAUMUR = celsius * 0.8f;
    final float RANKINE = (celsius * 1.8f) + 491.67f;

    System.out.printf("18 ºC convertido para Fahrenheit é %.2f ºF %n", FAHRENHEIT);
    System.out.printf("18 ºC convertido para Kelvin é %.2f K %n", KELVIN);
    System.out.printf("18 ºC convertido para Réaumur é %.2f ºRé %n", REAUMUR);
    System.out.printf("18 ºC convertido para Rankine %.2f ºRa %n", RANKINE);
  }
}
