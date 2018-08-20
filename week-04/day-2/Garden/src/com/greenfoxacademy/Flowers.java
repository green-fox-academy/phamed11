package com.greenfoxacademy;

import java.util.ArrayList;

public class Flowers {
  String color;
  int thirstLevel;
  ArrayList<Flowers> flowersList = new ArrayList<>();


  public Flowers(String color, int thirstLevel) {
    this.color = color;
    this.thirstLevel = thirstLevel;
  }

  public Flowers() {

  }


}
