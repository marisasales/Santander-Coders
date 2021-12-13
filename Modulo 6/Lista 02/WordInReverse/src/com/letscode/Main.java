package com.letscode;

import java.util.Scanner;

public class Main {
  /* Escreva um programa que lê uma palavra e a escreve de volta ao contrário. */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Escreva uma palavra qualquer: ");
    String word = scan.next();

//    **** Sem StringBuilder ****
    char[] letters = word.toCharArray();
    String reverse = "";

    for (int i = letters.length - 1; i >= 0; i--) {
      reverse += letters[i];
    }

//    **** Com StringBuilder ****
//    StringBuilder reverse = new StringBuilder();
//    reverse.append(word).reverse();

    System.out.printf("\"%s\" ao contrário é \"%s\".", word, reverse);
    scan.close();
  }
}
