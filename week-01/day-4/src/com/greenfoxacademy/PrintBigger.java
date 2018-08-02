package com.greenfoxacademy;

import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one
    Scanner scanner = new Scanner(System.in);
    System.out.print("Give me the first number: ");
    int num = scanner.nextInt();
    System.out.print("Give me the second number: ");
    int num2 = scanner.nextInt();
    int big;
    if (num > num2) {
      big = num;
    } else {
      big = num2;
    }
    System.out.println("The bigger number is: " + big);
  }
}
