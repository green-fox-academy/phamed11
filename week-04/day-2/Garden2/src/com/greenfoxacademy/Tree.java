package com.greenfoxacademy;

public class Tree extends Plants {

  public Tree(String color) {
    super.color = color;
    if (thirstLevel > 10) {
      thirsty = false;
    }
  }

  public double watering(double wateringAmount) {
    if (this.thirsty) {
      super.thirstLevel += wateringAmount * 0.4;
    }
//    if (this.thirstLevel > 10) {
//      this.thirsty = false;
//    }
    return thirstLevel;
  }

}

