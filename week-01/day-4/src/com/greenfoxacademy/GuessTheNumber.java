package com.greenfoxacademy;

import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8
    Scanner scanner = new Scanner(System.in);
    int num = 5;
    System.out.print("Guess the number i am thinking about: ");
    int guess = scanner.nextInt();
    while (guess != num) {
      if (guess < num) {
        System.out.print("The stored number is higher, guess again: ");
        guess = scanner.nextInt();
      } else if (guess > num) {
        System.out.print("The stored number is lower, guess again: ");
        guess = scanner.nextInt();
      }
    }
    System.out.println("You found the number: " + num);
  }
}
