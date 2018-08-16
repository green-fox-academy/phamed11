package com.greenfoxacademy;

public class Counter {

  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and counts down from n.
    System.out.println(recursive(10));


  }

  public static int recursive(int rec) {
    if (rec == 0) {
      return 1;
    } else {
      return rec * recursive(rec - 2);
    }
  }
}