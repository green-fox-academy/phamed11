package com.greenfoxacademy;

public class Strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    String test = "Xanax";
    System.out.println(strings(test));


  }

  public static String strings(String input) {
    int num = 0;
    if (input.length() > 0) {
      return input;
    } else {
      if (input.substring(0) == "x") {
        input.charAt(0) = 'y';
      }
    }
  }
}


