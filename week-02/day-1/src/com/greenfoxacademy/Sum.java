package com.greenfoxacademy;

import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer
    Scanner scanner = new Scanner(System.in);
    System.out.print("Give me a number, that I will summarize: ");
    int num = scanner.nextInt();
    System.out.println("The summary of these numbers is: " + sum(num));


  }
  public static int sum(int data) {
    int all = 0;
    for (int i = 0; i <= data; i++) {
      all += i;
    }
    return all;
  }
}