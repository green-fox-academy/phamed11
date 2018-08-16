package com.greenfoxacademy;

public class Power {
  public static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops)
    // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    int a = 3;
    int b = 4;
    System.out.println(power(a, b));


  }

  public static int power(int a, int b) {
    if (b == 0) {
      return 1;
    } else {
      return a * power(a, b - 1);
    }
  }
}
