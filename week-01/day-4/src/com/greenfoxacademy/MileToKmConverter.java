package com.greenfoxacademy;

import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    Scanner scanner = new Scanner(System.in);
    System.out.print("Give me a number I will convert it to miles from kilometers: ");
    int userInput2 = scanner.nextInt();
    double miles = userInput2 * 0.621371;
    System.out.println("So " + userInput2 + " kilometers is " + miles + " miles. You are welcome!" );



  }
}
