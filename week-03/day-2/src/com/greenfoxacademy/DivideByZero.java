package com.greenfoxacademy;

import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    Scanner scanner = new Scanner(System.in);
    System.out.print("Give me a number and I will divide 10 with it: ");
    int num = scanner.nextInt();
    zeroDivide(num);

  }
  public static void zeroDivide(int number) {
    double result = 0;
    try {
      result =  10 / number;
      System.out.println(result);
    } catch (ArithmeticException fail) {
      System.out.println("fail");
    }
  }
}
