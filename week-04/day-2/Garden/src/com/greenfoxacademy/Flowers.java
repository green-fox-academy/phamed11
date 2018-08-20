package com.greenfoxacademy;

import java.util.ArrayList;

public class Flowers extends Garden{

  public Flowers(String color) {
    this.color = color;
    if (this.thirstLevel < 5) {
      thirsty = true;
    }
  }

  public Flowers() {

  }

}
