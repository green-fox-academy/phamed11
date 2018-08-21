package com.greenfoxacademy;

public class Tree extends Plants {

  public Tree(String color) {
    super(color, 10);
  }

  public double watering(double wateringAmount) {
    if (this.thirsty) {
      super.thirstLevel += wateringAmount * 0.4;
    }
    return thirstLevel;
  }

}

