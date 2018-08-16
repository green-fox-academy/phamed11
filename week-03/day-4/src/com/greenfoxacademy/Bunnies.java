package com.greenfoxacademy;

public class Bunnies {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
  int bunnies = 100;
    System.out.println(bunnyEars(bunnies));

  }
  public static int bunnyEars(int bunnies) {
    if (bunnies == 0) {
      return 0;
    } else {
      return 2 + bunnyEars(bunnies - 1);
    }
  }
}
