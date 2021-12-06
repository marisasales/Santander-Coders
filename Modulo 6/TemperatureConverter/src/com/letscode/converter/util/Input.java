package com.letscode.converter.util;

import java.util.Scanner;

public class Input {

  public static float inputCelsius() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Informe a temperatura em celsius: ");
    return scan.nextFloat();
  }
}
