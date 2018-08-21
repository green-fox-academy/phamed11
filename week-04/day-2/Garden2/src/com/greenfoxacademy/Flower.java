package com.greenfoxacademy;

public class Flower extends Plants {

  public Flower(String color) {
    super.color = color;
    if (thirstLevel > 5) {
      thirsty = false;
    }
  }

  public double watering(double wateringAmount) {
    if (this.thirsty) {
      super.thirstLevel += wateringAmount * 0.75;
    }
//    if (this.thirstLevel > 5) {
//      this.thirsty = false;
//    }
    return thirstLevel;
  }


}
