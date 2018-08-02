package com.greenfoxacademy;

public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    double daily = 6.;
    double semester = 17.;
    double week = 5.;
    double semesterDay = semester * week;
    double aveHours = 52.;
    double allWorkHours = aveHours * semester;
    double codingHours = daily * semesterDay;
    double percent= codingHours / allWorkHours * 100;

    System.out.println("An attendee spends coding during the semester is " + daily * semesterDay);
    System.out.println("The percentage of coding hours is " + percent);


  }
}
