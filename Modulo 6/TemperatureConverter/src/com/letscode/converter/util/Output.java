package com.letscode.converter.util;

import com.letscode.converter.service.Calculator;

public class Output {

  public static void printFahrenheit(float celsius) {
    System.out.printf("%.2f ºC convertido para Fahrenheit é %.2f ºF %n", celsius, Calculator.fahrenheit(celsius));
  }

  public static void printKelvin(float celsius) {
    System.out.printf("%.2f ºC convertido para Kelvin é %.2f K %n", celsius, Calculator.kelvin(celsius));
  }

  public static void printReaumur(float celsius) {
    System.out.printf("%.2f ºC convertido para Réaumur é %.2f ºRé %n", celsius, Calculator.reaumur(celsius));
  }

  public static void printRankine(float celsius) {
    System.out.printf("%.2f ºC convertido para Rankine %.2f ºRa %n", celsius, Calculator.rankine(celsius));
  }
}
