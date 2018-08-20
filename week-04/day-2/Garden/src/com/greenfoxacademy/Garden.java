package com.greenfoxacademy;

import java.util.ArrayList;

public class Garden {
  ArrayList<Garden> myGarden = new ArrayList<>();


  public Garden(ArrayList<Flowers> flowersArrayList, ArrayList<Trees> treesArrayList ) {
    flowersArrayList = new ArrayList<>();
    treesArrayList = new ArrayList<>();
  }

}