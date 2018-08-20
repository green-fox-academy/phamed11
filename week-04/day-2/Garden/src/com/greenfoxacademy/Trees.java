package com.greenfoxacademy;

import java.util.ArrayList;

public class Trees extends Garden{
  ArrayList<Trees> Tt = new ArrayList<>();

    public Trees(String color) {
    this.color = color;
    Trees name = new Trees();
    Tt.add(name);
  }

  public Trees() {

  }


}

