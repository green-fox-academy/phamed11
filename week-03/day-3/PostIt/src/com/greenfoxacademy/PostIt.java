package com.greenfoxacademy;

public class PostIt {
  private String backgroundColor;
  private String text;
  private String textColor;

  public void PostIt(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.textColor = text;
    this.textColor = textColor;
  }
  public void BackGroundColor() {
    System.out.println("My background color is: " + backgroundColor);
  }
}