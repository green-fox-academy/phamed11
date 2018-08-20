package com.greenfoxacademy;

import java.util.ArrayList;

public class Cohort {
  String name;
  ArrayList<Student> students = new ArrayList<>();
  ArrayList<Mentor> mentors = new ArrayList<>();

  public Cohort(String name) {
  this.name = name;
  }

  public ArrayList<Student> addStudent(Student name) {
    students.add(name);
    return students;
  }

  public ArrayList<Mentor> addMentor(Mentor name) {
    mentors.add(name);
    return mentors;
  }

  public String info() {
  return "The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.";
  }

}
