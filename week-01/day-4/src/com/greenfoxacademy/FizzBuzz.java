package com.greenfoxacademy;

public class FizzBuzz {
  public static void main(String[] args) {
    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”.
    String buzz = "Buzz";
    String fizzb = "FizzBuzz";
    for (int a = 1; a < 101; a++) {
      if (a % 3 == 0){
        System.out.println(buzz);
      }  else if (a % 5 == 0)  {
        System.out.println(fizzb);
      }  else {
        System.out.println(a);
      }
    }

  }
}
