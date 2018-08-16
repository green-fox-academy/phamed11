package com.greenfoxacademy;

public class Sharpie {
      //        Create Sharpie class
      //        We should know about each sharpie their color (which should be a string), width
      //        (which will be a floating point number), inkAmount (another floating point number)
      //        When creating one, we need to specify the color and the width
      //        Every sharpie is created with a default 100 as inkAmount
      //        We can use() the sharpie objects
      //        which decreases inkAmount
  public String color;
  public int width;
  public int inkAmount;

  public Sharpie(String color, int width) {
    inkAmount = 100;
    this.width = width;
    this.color = color;
  }
  public void use(int inkAmoundDecrease) {
    inkAmount -= inkAmoundDecrease;
  }

}
