package com.greenfoxacademy;

import java.util.ArrayList;

public class Flowers extends Garden{
  ArrayList<Flowers> Ff = new ArrayList<>();

  public Flowers(String color) {
    this.color = color;
    Flowers name = new Flowers();
    Ff.add(name);
  }

  public Flowers() {

  }
}
