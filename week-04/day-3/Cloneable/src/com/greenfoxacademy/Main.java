package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {
    Student student = new Student("John", 20, "male", "BME");
    Student newKid = student.clone();
    newKid.introduce();


  }
}
