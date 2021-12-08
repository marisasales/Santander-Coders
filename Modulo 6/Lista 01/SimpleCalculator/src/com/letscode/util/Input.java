package com.letscode.util;

import java.util.Scanner;

public class Input {
  private static Scanner scan = new Scanner(System.in);

  public static int operatorMenu() {
    System.out.println("------- Menu -------");
    System.out.println("[1] Soma -----------");
    System.out.println("[2] Subtração ------");
    System.out.println("[3] Multiplicação --");
    System.out.println("[4] Divisão --------");
    System.out.print("Resposta: ");
    return scan.nextInt();
  }

  public static char getAnswer() {
    System.out.print("Deseja continuar? [S/N] ");
    return scan.next().toUpperCase().charAt(0);
  }

  public static int[] getNumbers() {
    System.out.print("Digite o primeiro número: ");
    int num1 = scan.nextInt();

    System.out.print("Digite o segundo número: ");
    int num2 = scan.nextInt();
    return new int[] {num1, num2};
  }

  public static void close() {
    scan.close();
  }
}
