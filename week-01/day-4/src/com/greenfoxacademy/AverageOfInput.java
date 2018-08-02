package com.greenfoxacademy;

import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4
    Scanner scanner = new Scanner(System.in);
    System.out.print("Give me the first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Give me the second number: ");
    int num2 = scanner.nextInt();
    System.out.print("Give me the third number: ");
    int num3 = scanner.nextInt();
    System.out.print("Give me the fourth number: ");
    int num4 = scanner.nextInt();
    int sum = num1 + num2 + num3 + num4;
    double ave = sum / 4;
    System.out.println("Sum: " + sum + "," + " 5Average: " + ave) ;

  }
}
