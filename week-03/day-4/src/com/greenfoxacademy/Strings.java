package com.greenfoxacademy;

public class Strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    String test = "Xanax";
    System.out.println(strings(test));


  }

  public static String strings(String input) {
    input = input.toLowerCase();
    int charPo = 0;
    String result = "";
    int len = input.length();
    if (charPo > input.length()) {
      return input;
    } else {
      if (input.substring(charPo).equals('x')) {
        result += strings(input.substring(0, charPo + 1));
      } else {
        result += strings(input.substring(0, charPo + 1));
      }
    }
    return result;
  }
}


