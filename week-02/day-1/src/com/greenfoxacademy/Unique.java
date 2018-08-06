package com.greenfoxacademy;


import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {
////    //  Create a function that takes a list of numbers as a parameter
////    //  Returns a list of numbers where every number in the list occurs only once
////    //  Example
////    //   System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
////    //  should print: `[1, 11, 34, 52, 61]`

    System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));


  }

  public static String unique(int[] uni) {
    int[] res = new int[uni.length];
    int[] kuka = new int[uni.length];
    Arrays.sort(uni);
    for (int i = 0; i < uni.length - 1; i++) {
      for (int j = 1; j < uni.length - 1; j++) {
        if (uni[i] == uni[j]) {
          kuka[i] = uni[i];
        } else {
          res[j] = uni[j];
        }
      }
    }
    return Arrays.toString(kuka);
  }
}


