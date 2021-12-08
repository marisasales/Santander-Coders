package com.letscode;

import java.util.Scanner;

public class Main {
  /* Escreva um programa que realiza conversão de medidas de polegadas em centímetros. */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Informe a medida em polegadas: ");
    float inches = scan.nextFloat();

    float cm = inches * 2.54f;

    System.out.printf("%.1f polegadas = %.1f centímetros.%n", inches, cm);

    scan.close();
  }
}
