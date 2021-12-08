package com.letscode;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  /* Escreva um programa que recebe a cotação do dólar do dia e, seguida recebe
  um valor em reais. A saída é a quantia em dólares. Use formatação de saída
  para exibir os valores de acordo com cada representação de moeda. */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char answer;

    System.out.print("Informe a cotação do dólar: $");
    double dollarQuotation = scan.nextDouble();

    do {
      System.out.print("Informe o valor em reais: R$");
      double realValue = scan.nextDouble();

      double dollarValue = realValue / dollarQuotation;
      String dollarFormat = formatCurrency(dollarValue, Locale.US);
      String realFormat = formatCurrency(realValue, new Locale("pt","BR"));

      System.out.printf("%s convertido para dólares é %s%n", realFormat, dollarFormat);

      System.out.print("Deseja informar outro valor? (S/N): ");
      answer = scan.next().toUpperCase().charAt(0);
    } while (answer == 'S');

    scan.close();
  }

  public static String formatCurrency(double value, Locale locale) {
    return NumberFormat.getCurrencyInstance(locale).format(value);
  }
}
