package com.letscode;

import java.util.Scanner;

public class Main {
/* Escreva um programa que lê nome, altura e peso de 5 pessoas, calcula o IMC de cada
e ao final informa se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25) */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[][] people = new String[5][4];

    for (int i = 0; i < people.length; i++) {
      float altura, peso, imc;
      String name;

      System.out.printf("------- %dª Pessoa -------%n", i+1);
      System.out.print("Nome: ");
      name = scan.next();

      System.out.print("Altura (ex: 1,72): ");
      altura = scan.nextFloat();

      System.out.print("Peso (ex: 65,5): ");
      peso = scan.nextFloat();
      imc = peso / (altura * altura);

      people[i][0] = name;
      people[i][1] = String.valueOf(altura);
      people[i][2] = String.valueOf(peso);
      people[i][3] = String.valueOf(imc);
    }
    scan.close();

    System.out.println("------------- Resultado -------------");
    System.out.println("O peso ideal é entre 18,5 e 25.");
    System.out.println("-------------------------------------");
    for (String[] person : people) {
      String name = person[0];
      float imc = Float.parseFloat(person[3]);

      System.out.printf("Nome: %s - IMC: %.1f%n", name, imc);
      if (imc < 18.5) {
        System.out.printf("%s está abaixo do peso ideal.%n", name);
      } else if (imc > 25) {
        System.out.printf("%s está acima do peso ideal.%n", name);
      } else {
        System.out.printf("%s está no peso ideal.%n", name);
      }
      System.out.println("-------------------------------------");
    }
  }
}
