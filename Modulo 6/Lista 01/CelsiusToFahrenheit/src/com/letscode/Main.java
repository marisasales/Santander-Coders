package com.letscode;

import java.util.Scanner;

public class Main {
  /* Escreva um programa que converte temperaturas de Celsius para Fahrenheit. */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Informe a temperatura em celsius: ");
    float celsius = scan.nextFloat();

    final float FAHRENHEIT = (celsius * 1.8f) + 32f;

    System.out.printf("%.2f ºC convertido para Fahrenheit é %.2f ºF %n", celsius, FAHRENHEIT);

    scan.close();
  }
}
