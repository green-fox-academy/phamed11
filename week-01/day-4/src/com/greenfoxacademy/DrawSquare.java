package com.greenfoxacademy;

import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %   %
    // %   %
    // %   %
    // %   %
    // %%%%%
    //
    // The square should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.print("How high do you want the square? ");
    int num = scanner.nextInt();
    for (int a = 1; a <= 5; a++) {
      System.out.print("%");
    }
    System.out.println();
    for (int b = 1; b <= num -2; b++) {
      System.out.println("%   %");
    }
    for (int c = 1; c <= 5; c++) {
      System.out.print("%");
    }
    System.out.println();
  }
}
