package com.greenfoxacademy;

public class SwapElements {
  public static void main(String[] args) {
    // - Create an array variable named `abc`
    //   with the following content: `["first", "second", "third"]`
    // - Swap the first and the third element of `abc`
    String[] abc = {"first", "second", "third"};
    String[] swap = new String[3];
//    System.out.println(abc[0]);
    System.arraycopy(abc, 0, swap, 0, 3);
    abc[0] = swap[2];
    abc[2] = swap[0];
    for (int i = 0; i < abc.length; i++) {
      System.out.println(abc[i]);
    }
  }
}
