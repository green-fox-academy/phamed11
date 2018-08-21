package com.greenfoxacademy;

public class Flower extends Plants {

  public Flower(String color) {
    super (color, 5);
  }

  public double watering(double wateringAmount) {
    if (this.thirsty) {
      super.thirstLevel += wateringAmount * 0.75;
    }
    return thirstLevel;
  }


}
