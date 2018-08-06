package com.greenfoxacademy;

public class DoubleItems {
  public static void main(String[] args) {
    // - Create an array variable named `numList`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Double all the values in the array
    int[] numList = {3, 4, 5, 6, 7};
    doubling(numList);
    for (int j = 0; j < numList.length; j++) {
      System.out.println(numList[j]);
    }

  }

  public static void doubling(int[] douNum) {
    for (int i = 0; i < douNum.length; i++) {
      douNum[i] *= 2;
    }
  }
}

