package com.greenfoxacademy;

import java.util.ArrayList;

public class Trees extends Flowers{
  ArrayList<Trees> treesList = new ArrayList<>();


    public Trees(String color, int thirstLevel) {
    this.color = color;
    this.thirstLevel = thirstLevel;
    thirstLevel = 9;
  }

  public Trees() {

  }


}

