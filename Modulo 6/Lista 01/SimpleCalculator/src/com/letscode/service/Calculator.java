package com.letscode.service;

public class Calculator {
  public static int add(int[] numbers) {
    return numbers[0] + numbers[1];
  }

  public static int subtract(int[] numbers) {
    return numbers[0] - numbers[1];
  }

  public static int multiply(int[] numbers) {
    return numbers[0] * numbers[1];
  }

  public static float divide(int[] numbers) {
    return (float) numbers[0] / numbers[1];
  }
}
