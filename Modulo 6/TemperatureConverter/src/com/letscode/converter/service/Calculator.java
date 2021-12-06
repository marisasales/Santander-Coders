package com.letscode.converter.service;

public class Calculator {

  public static float fahrenheit(float celsius) {
    return (celsius * 1.8f) + 32f;
  }

  public static float kelvin(float celsius) {
    return celsius + 273.15f;
  }

  public static float reaumur(float celsius) {
    return celsius * 0.8f;
  }

  public static float rankine(float celsius) {
    return (celsius * 1.8f) + 491.67f;
  }
}
