package com.greenfoxacademy.jsonexercises.models;

import java.util.ArrayList;
import java.util.List;

public class Array {
  private String what;
  private List<Integer> numbers;

  public Array(String what) {
    numbers = new ArrayList<>();
    this.what = what;
  }

  public Array() {
    numbers = new ArrayList<>();
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  @Override
  public String toString() {
    return "Array{" +
        "what='" + what + '\'' +
        ", numbers=" + numbers +
        '}';
  }
}


