package com.letscode;

import java.util.Scanner;

public class Main {
  /* Escreva um programa que lê nome e idade de 5 pessoas e ao final informa
  quem é o mais novo, o mais velho e qual a média de idade. */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[][] people = new String[5][2];
    String youngName = "";
    String oldName = "";
    int youngAge = 0;
    int oldAge = 0;
    int total = 0;
    float average;

    for (int line = 0; line < people.length; line++) {
      System.out.printf("Nome da %dª pessoa: ", line+1);
      people[line][0] = scan.next();
      String currentName = people[line][0];

      System.out.printf("Idade da %dª pessoa: ", line+1);
      people[line][1] = scan.next();
      int currentAge = Integer.parseInt(people[line][1]);

      if (line == 0) {
        youngName = currentName;
        youngAge = currentAge;
        oldName = currentName;
        oldAge = currentAge;
      } else if (currentAge < youngAge) {
        youngName = currentName;
        youngAge = currentAge;
      } else if (currentAge > oldAge) {
        oldName = currentName;
        oldAge = currentAge;
      }
      total += currentAge;
    }
    scan.close();

    average = (float) total / people.length;

    System.out.println("--------------- RESULTADO ---------------");
    System.out.printf("%s tem %d anos e é o mais novo.%n", youngName, youngAge);
    System.out.printf("%s tem %d anos e é o mais velho.%n", oldName, oldAge);
    System.out.println("A média de idade é " + average);
  }
}
