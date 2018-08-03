package com.greenfoxacademy;

import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    char cs = '*';
    System.out.print("Gimme a number: ");
    int num = scanner.nextInt();
    for (int a = 1; a <= num; a++) {
      for (int b = 1; b <= a; b++) {
        System.out.print(cs);
      }
      System.out.println("");
    }
  }
}


