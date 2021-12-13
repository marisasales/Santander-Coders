package com.letscode;

import java.util.Scanner;

public class Main {
  /* Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados.
  Ao final, informe qual o nome mais longo presente na lista. */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] guests = new String[5];
    String maxName = "";
    int maxLength;

    for (int i = 0; i < guests.length; i++) {
      System.out.printf("Digite o nome do %dº convidado: ", i+1);
      guests[i] = scan.nextLine();

      if (i == 0) {
        maxName = guests[i];
      } else {
        if (guests[i].length() > maxName.length()) {
          maxName = guests[i];
        }
      }
    }
    scan.close();

    maxLength = maxName.replace(" ","").length();

    System.out.println("---------------------- Resultado ----------------------");
    System.out.printf("O maior nome é \"%s\" com %d letras.%n", maxName, maxLength);
  }
}
