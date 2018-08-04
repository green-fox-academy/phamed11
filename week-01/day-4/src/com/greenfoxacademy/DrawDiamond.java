package com.greenfoxacademy;

import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.print("How big do you want your piramid: ");
    int num = scanner.nextInt();
    for (int a = 1; a <= num; a++) {
      for (int b = num - 1; b >= a; b--) {
        System.out.print(" ");
      }
      for (int c = 1; c < (a * 2); c++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = num -1; i > 0; i--) {
      for (int j = 1; j <= num - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
