package com.greenfoxacademy;

import com.sun.tools.javac.comp.Flow;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  int wateringAmount;
  String color;
  int thirstLevel;
  boolean thirsty;
  List<Flowers> myGardenFlowers = new ArrayList<>();
  List<Trees> myGardenTrees = new ArrayList<>();
  int numberOfPlants = myGardenFlowers.size() - 1 + myGardenTrees.size() - 1;

  public Garden() {

  }

  public void watering(int wateringAmount) {
    for (int i = 0; i < myGardenFlowers.size(); i++) {
      myGardenFlowers.get(i).thirstLevel += (wateringAmount / numberOfPlants);
    }
    for (int i = 0; i < myGardenFlowers.size(); i++) {
      myGardenTrees.get(i).thirstLevel += (wateringAmount / numberOfPlants);
    }
  }

  public void status() {
    for (int i = 0; i < myGardenFlowers.size(); i++) {
      if (myGardenFlowers.get(i).thirstLevel < 5) {
        System.out.println("The " + myGardenFlowers.get(i).color + " Flower needs water.");
      } else {
        System.out.println("The " + myGardenFlowers.get(i).color + " Flower doesn't need water.");
      }
    }
    for (int i = 0; i < myGardenTrees.size(); i++) {
      if (myGardenTrees.get(i).thirstLevel < 5) {
        System.out.println("The " + myGardenTrees.get(i).color + " Tree needs water.");
      } else {
        System.out.println("The " + myGardenTrees.get(i).color + " Tree doesn't need water.");
      }
    }
  }

}