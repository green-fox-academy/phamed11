package com.greenfoxacademy;

public class Sharpie {

  public String color;
  public float width;
  public float inkAmount;

  public Sharpie(String color, float width) {
    inkAmount = 100f;
    this.width = width;
    this.color = color;
  }
  public void use(float inkAmoundDecrease) {
    inkAmount -= inkAmoundDecrease;
  }

}
