package com.greenfoxacademy;

public class Reverse {
  public static void main(String[] args) {
    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`
    int[] aj = {3, 4, 5, 6, 7};
    int[] swap = {7, 6, 5, 4, 3};
    for (int i = 0; i <= aj.length - 1; i++) {
      aj[i] = swap[i];
    }
    for (int k = 0; k < swap.length; k++) {
      System.out.println(aj[k]);
    }
  }
}
