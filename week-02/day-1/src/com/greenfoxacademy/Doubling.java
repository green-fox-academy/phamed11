package com.greenfoxacademy;

public class Doubling {
  public static void main(String[] args) {
    // - Create an integer variable named `baseNum` and assign the value `123` to it
    // - Create a function called `doubling` that doubles it's input parameter and returns with an integer
    // - Print the result of `doubling(baseNum)`

    int baseNum = 123;
    int kicsi = 44;
    System.out.println(doubling(baseNum));
    System.out.println(doubling(kicsi));

  }

    public static int doubling(int jozsi) {
    jozsi*=2;
    return jozsi;
  }

}
