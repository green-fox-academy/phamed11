package com.greenfoxacademy;

import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    String first = "Dog";
    String second = "god";


  }

  public  Boolean anagram(String first, String second) {
    String f = first.toLowerCase();
    String s = second.toLowerCase();
    String[] splitfirst;
    String[] splitsecond;
    String toCheck1 = "";
    String toCheck2 = "";
    splitfirst = f.split("");
    splitsecond = s.split("");
    Arrays.sort(splitfirst);
    Arrays.sort(splitsecond);
    for (String ss : splitfirst) {
      toCheck1 += ss;
    }
    for (String d : splitsecond) {
      toCheck2 += d;
    }
    if (toCheck1.equals(toCheck2)) {
      return true;
    } else {
      return false;
    }
  }
}