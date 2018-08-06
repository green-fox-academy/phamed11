package com.greenfoxacademy;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
    Scanner scanner = new Scanner(System.in);
    System.out.print("Gimme a number: ");
    int numo = scanner.nextInt();
    System.out.println(factorio(numo));

  }
  public static int factorio(int fato) {
    int all = 1;
    for (int i = 1; i <= fato; i++) {
      all*=i;
    }
    return all;
  }
}
