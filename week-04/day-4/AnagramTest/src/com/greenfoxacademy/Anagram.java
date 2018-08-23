package com.greenfoxacademy;

import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    String first = "doguoij";
    String second = "jiougod";
    Anagram(first,second);


  }

  public static void Anagram(String first, String second) {
    String[] splitfirst = {""};
    String[] splitsecond = {""};
    String toCheck1 = "";
    String toCheck2 = "";
    splitfirst = first.split("");
    splitsecond = second.split("");
    Arrays.sort(splitfirst);
    Arrays.sort(splitsecond);
    for (String s : splitfirst) {
      toCheck1 += s;
    }
    for (String d : splitsecond) {
      toCheck2 += d;
    }
    if (toCheck1.equals(toCheck2)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}