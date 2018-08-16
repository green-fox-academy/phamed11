package com.greenfoxacademy;

public class StringTwo {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    String zero = "matrixmatrix";
    System.out.println(stringsagain(zero));
  }

  public static String stringsagain(String input) {
    input = input.toLowerCase();
    String result = "";
    if (input.length() == 0) {
      return input;
    } else {
      for (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) == 'x') {
          result += input.replace();
        } else {
          result += input.charAt(i);
        }
      }
    }
    return result;
  }
}
