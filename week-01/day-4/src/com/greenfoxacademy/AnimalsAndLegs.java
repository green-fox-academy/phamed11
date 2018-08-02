package com.greenfoxacademy;

import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many chickens does the farmer have: ");
    int chicken = scanner.nextInt();
    System.out.print("How many pig are on the farm?: ");
    int pig = scanner.nextInt();
    chicken = chicken * 2;
    pig = pig * 4;
    System.out.println("There are " + pig + chicken + " chicken and pig legs are at the farm altogether.");
  }
}
