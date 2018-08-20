package com.greenfoxacademy;

import java.util.ArrayList;

public class Flowers {
  String color;
  int thirstLevel;
  boolean thirsty;
  ArrayList<Flowers> flowersList = new ArrayList<>();


  public Flowers(String color, int thirstLevel) {
    this.color = color;
    this.thirstLevel = thirstLevel;
    thirstLevel = 0;
    if (this.thirstLevel < 5) {
      thirsty = true;
    }
  }

  public Flowers() {

  }


}
