package com.letscode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
/* Escreva um programa que lê 5 números. Ao final, escreva primeiro todos os ímpares, depois todos os pares. */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> evenNumbers = new ArrayList<>();
    ArrayList<Integer> oddNumbers = new ArrayList<>();

    System.out.println("-------- Par ou ímpar --------");
    for (int i = 0; i < 5; i++) {
      System.out.printf("Digite o %dº número: ", i+1);
      int number = scan.nextInt();

      if (number % 2 == 0) {
        evenNumbers.add(number);
      } else {
        oddNumbers.add(number);
      }
    }
    scan.close();

    System.out.println("--------- Resultado ---------");
    System.out.println("Ímpares: " + oddNumbers);
    System.out.println("Pares: " + evenNumbers);
  }
}
