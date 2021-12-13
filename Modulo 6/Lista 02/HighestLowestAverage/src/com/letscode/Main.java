package com.letscode;

import java.util.Scanner;

public class Main {
  /* Escreva um programa que lê 5 números e informa o maior, o menor e a média deles. */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] numbers = new int[5];
    int max = 0;
    int min = 0;
    int total = 0;
    float average;

    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("Digite o %dº número: ", i + 1);
      numbers[i] = scan.nextInt();
      total += numbers[i];

      if (i == 0) {
        max = min = numbers[i];
      } else if (numbers[i] > max) {
        max = numbers[i];
      } else if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    scan.close();
    average = (float) total / numbers.length;

    System.out.println("---- Resultados ----");
    System.out.println("Maior número: " + max);
    System.out.println("Menor número: " + min);
    System.out.println("Média: " + average);
  }
}
