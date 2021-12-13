package com.letscode;

import java.util.Scanner;

public class Main {
  /* Escreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo. */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word;
    StringBuilder studlyCaps = new StringBuilder();

    System.out.print("Digite uma palavra: ");
    word = scan.next();
    char[] letters = word.toCharArray();

    for (int i = 0; i < letters.length; i++) {
      studlyCaps.append(i % 2 == 0
              ? Character.toUpperCase(letters[i])
              : Character.toLowerCase(letters[i]));
    }
    scan.close();

    System.out.println(studlyCaps);
  }
}
