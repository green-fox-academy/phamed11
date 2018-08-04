package com.greenfoxacademy;

import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {

    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4
    Scanner scanner = new Scanner(System.in);
    System.out.print("Gimme a number: ");
    int num = scanner.nextInt();
    int summ = 0;
    int [] numArray = new int [num];
    for (int b = 1; b <= numArray.length; b++) {
      System.out.print("Enter the " + b + ". number: ");
      numArray[b - 1] = scanner.nextInt();
    }
    for (int a = 0; a < numArray.length; a++) {
      summ+=numArray[a];
    }
    double ave = summ / numArray.length;
    System.out.println("Sum: " + summ + " Average: " + ave);
  }
}