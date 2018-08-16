package com.greenfoxacademy;

public class Strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    String test = "matrix is the BEST MATRIX even if X is not a matrix";
    System.out.println(strings(test));


  }

  public static String strings(String input) {
    input = input.toLowerCase();
    String result = "";
    if (input.length() == 0) {
      return input;
    } else {
      for (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) == 'x') {
          result += 'y';
        } else {
          result += input.charAt(i);
        }
      }
    }
    return result;
  }
}
