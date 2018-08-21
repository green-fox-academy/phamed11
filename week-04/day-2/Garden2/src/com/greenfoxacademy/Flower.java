package com.greenfoxacademy;

public class Flower extends Plants {

  public Flower(String color) {
    super.color = color;
    thirstLevel = 0;
//    if (thirstLevel < 5) {
//      thirsty = true;
//    }
  }

  public double watering(double wateringAmount) {
    if (this.thirsty) {
      this.thirstLevel += wateringAmount * 0.75;
    }
    if (this.thirstLevel > 5) {
      this.thirsty = false;
    }
    return thirstLevel;
  }


}
