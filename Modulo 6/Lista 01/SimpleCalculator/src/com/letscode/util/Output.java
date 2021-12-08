package com.letscode.util;

public class Output {
  public static void result(int[] numbers, char op, float total, boolean isDivide) {
    if (isDivide) {
      System.out.printf("%d %c %d = %.2f %n", numbers[0], op, numbers[1], total);
    } else {
     System.out.printf("%d %c %d = %.0f %n", numbers[0], op, numbers[1], total);
    }
  }

  public static void invalid(int op) {
    System.out.printf("Operação inválida! %n[%d] não encontrado.%n", op);
  }
}
