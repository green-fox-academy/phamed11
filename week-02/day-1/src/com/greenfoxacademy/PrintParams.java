package com.greenfoxacademy;

public class PrintParams {
  public static void main(String[] args) {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `printParams`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printParams("first")
    // printParams("first", "second")
    // printParams("first", "second", "third", "fourh")
    // ...
   printParams("hello", "mi van","mit nezel");


  }
  public static void printParams(String ...a) {
    for (String i : a)
      System.out.println(i + "");
    System.out.println();
  }
}
