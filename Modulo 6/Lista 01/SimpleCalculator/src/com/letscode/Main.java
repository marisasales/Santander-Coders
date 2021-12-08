package com.letscode;

import com.letscode.service.Calculator;
import com.letscode.util.Input;
import com.letscode.util.Output;

import java.util.Scanner;

public class Main {
  /* Escreva um programa que recebe dois números inteiros e informa o resultado das operações
  soma, subtração, multiplicação e divisão. Considere sempre a ordem em que foram informados. */

  public static void main(String[] args) {
    int[] numbers = new int[2];
    float total = 0;
    int operator = 0;
    char answer = 'N';

    do {
      numbers = Input.getNumbers();
      operator = Input.operatorMenu();

      switch (operator) {
        case 1:
          total = Calculator.add(numbers);
          Output.result(numbers, '+', total, false);
          break;
        case 2:
          total = Calculator.subtract(numbers);
          Output.result(numbers, '-', total, false);
          break;
        case 3:
          total = Calculator.multiply(numbers);
          Output.result(numbers, '×', total, false);
          break;
        case 4:
          total = Calculator.divide(numbers);
          Output.result(numbers, '÷', total, true);
          break;
        default:
          Output.invalid(operator);
          break;
      }

      answer = Input.getAnswer();
    } while (answer == 'S');

    Input.close();
  }
}
