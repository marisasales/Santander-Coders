package com.letscode.util;

public class Output {
  public static void result(int[] numbers, char op, int total) {
    System.out.printf("%d %c %d = %d %n", numbers[0], op, numbers[1], total);
  }

  public static void invalid(int op) {
    System.out.printf("Operação inválida! %n[%d] não encontrado.%n", op);
  }
}
