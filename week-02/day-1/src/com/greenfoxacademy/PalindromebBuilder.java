package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromebBuilder {
  public static void main(String[] args) {

//    Create a function named create palindrome following your current language's style guide. It should take a string,
//    create a palindrome from it and then return it.
//
//    Examples
//    input	output
//    ""	""
//    "greenfox"	"greenfoxxofneerg"
//    "123"	"123321"
    String pali = "palidrome";
    palidrome(pali);
    System.out.println();
    palidrome2(pali);

  }
  public static void palidrome(String input) {
    String[] toTurn = new String[input.length()];
    toTurn = input.split("");
    ArrayList<String> returned = new ArrayList<>();
    for (int i = input.length() - 1; i >= 0; i--) {
      returned.add(toTurn[i]);
    }
    System.out.print(input);
    for (int i = 0; i < returned.size(); i++) {
      System.out.print(returned.get(i));
    }
  }

   // second try
  
  public static void palidrome2(String input) {
    String[] toTurn = new String[input.length()];
    toTurn = input.split("");
    String juhu = "";
    ArrayList<String> returned = new ArrayList<>();
    for (int i = input.length() - 1; i >= 0; i--) {
      returned.add(toTurn[i]);
    }
    for (int i = 0; i < returned.size(); i++) {
      juhu += returned.get(i);
    }
    System.out.println(input+juhu);
  }
}
