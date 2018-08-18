package com.greenfoxacademy;

public class Bunnies2 {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    System.out.println(bunniesAgain(6));

  }
  public static int bunniesAgain(int bunnies) {
    int totalEars = 0;
    if (bunnies == 0) {
      return 0;
    } else {
      if (bunnies % 2 == 0) {
        totalEars += 3 + bunniesAgain(bunnies - 1);
      } else {
        totalEars += 2 + bunniesAgain(bunnies -1);
      }
    }
    return totalEars;
  }
}
