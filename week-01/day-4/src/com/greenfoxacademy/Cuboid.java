package com.greenfoxacademy;

public class Cuboid {
  public static void main(String[] args) {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000
    double a = 45.43;
    double b = 32.11;
    double c = 44.33;
    double surfaceArea = (2 * a * b) + (2 * a * c) + (2 * b * c);
    double volume = a * b * c;
    System.out.println("Surface Area: " + surfaceArea);
    System.out.println("Volume: " + volume);
    }
  }
