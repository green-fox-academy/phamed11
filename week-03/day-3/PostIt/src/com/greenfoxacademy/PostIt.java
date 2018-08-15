package com.greenfoxacademy;

public class PostIt {
   String backgroundColor;
   String text;
   String textColor;

  public void PostIt(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }
  public void BackGroundColor() {
    System.out.println("My background color is: " + backgroundColor);
  }
}