package com.greenfoxacademy;

public class NumberAdder {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    System.out.println(numberAdder(4));


  }
  public static int numberAdder(int parameter) {
    if (parameter == 1 ) {
      return 1;
    } else {
      return parameter + numberAdder(parameter - 1);
    }
  }
}
