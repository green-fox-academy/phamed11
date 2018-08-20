package com.greenfoxacademy;

public class Student {
  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ". From" + previousOrganization
        + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public int skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
    return skippedDays;
  }


}
