package com.greenfoxacademy;

public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int currentTimeSeconds = currentHours * 3600 + currentMinutes * 60 + currentSeconds;
    int wholeDaySeconds =  86400;
    System.out.println(wholeDaySeconds - currentTimeSeconds);

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables

  }
}
