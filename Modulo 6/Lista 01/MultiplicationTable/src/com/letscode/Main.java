package com.letscode;

import java.util.Scanner;

public class Main {
  /* Escreva um programa que informa a tabuada de um número informado (entre 1-10). */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char answer;

    do {
      System.out.print("Gostaria de ver a tabuada de qual número? ");
      int num = scan.nextInt();

      for (int i = 1; i <= 10; i++) {
        System.out.printf("%d × %d = %d%n", num, i, num * i);
      }

      System.out.print("Deseja continuar? (S/N) ");
      answer = scan.next().toUpperCase().charAt(0);
    } while (answer == 'S');

    scan.close();
  }
}
