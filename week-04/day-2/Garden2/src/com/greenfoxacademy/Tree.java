package com.greenfoxacademy;

public class Tree extends Plants {

  public Tree(String color) {
    super.color = color;
    thirstLevel = 0;
//    if (thirstLevel < 10) {
//      thirsty = true;
//    }
  }

  public double watering(double wateringAmount) {
    if (this.thirsty) {
      super.thirstLevel += wateringAmount * 0.4;
    }
    return thirstLevel;
  }

}

