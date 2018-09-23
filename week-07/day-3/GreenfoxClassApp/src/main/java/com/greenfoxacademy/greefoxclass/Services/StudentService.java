package com.greenfoxacademy.greefoxclass.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {
  ArrayList<String> names;

  @Autowired
  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  public List<String> findAll() {
    return names;
  }

  public void save(String student) {
    names.add(student);
  }

  public String getName(int index) {
    return findAll().get(index);
  }

  public int numberOfStudents() {
    return names.size();
  }

  public boolean isAStudent(String name) {
    return names.contains(name);
  }

 }
