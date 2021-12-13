package com.letscode;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  /* Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras.
  Ao final da entrada dos 5 itens, exiba a lista completa. */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] shoppingCart = new String[5];

    for (int i = 0; i < shoppingCart.length; i++) {
      System.out.printf("Nome da %dª fruta: ", i+1);
      shoppingCart[i] = scan.nextLine();
    }
    scan.close();

    System.out.println("Carrinho de compras:");
    Arrays.stream(shoppingCart).forEach(fruit -> System.out.println("- " + fruit));
  }
}
