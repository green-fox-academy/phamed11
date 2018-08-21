package com.greenfoxacademy;

import java.util.ArrayList;

public class Garden {
  ArrayList<Plants> garden = new ArrayList<>();

  public Garden() {

  }

  public void watering(int wateringAmount) {
    int numberOfThirstyPlants = 0;
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).thirstyOrNot()) {
        numberOfThirstyPlants++;
      }
    }
    System.out.println("Watering with " + wateringAmount);
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).thirstyOrNot()) {
        garden.get(i).thirstLevel += (double) wateringAmount / numberOfThirstyPlants;

      }
    }
    statusOfTheGarden();
  }

  public void statusOfTheGarden() {
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i) instanceof Flower && garden.get(i).thirstyOrNot()) {
        System.out.println("The " + garden.get(i).color + " Flower needs water.");
      } else if (garden.get(i) instanceof Flower && !garden.get(i).thirstyOrNot()) {
        System.out.println("The " + garden.get(i).color + " Flower doesn't need water.");
      }
    }
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i) instanceof Tree && garden.get(i).thirstyOrNot()) {
        System.out.println("The " + garden.get(i).color + " Tree needs water.");
      } else if (garden.get(i) instanceof Tree && !garden.get(i).thirstyOrNot()) {
        System.out.println("The " + garden.get(i).color + " Tree doesn't need water.");
      }
    }
  }

  public void thirstLevelOfGarden() {
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i) instanceof Flower) {
        System.out.println("The " + garden.get(i).color + " Flower's thirstlevel is " + garden.get(i).thirstLevel);
      } else {
        System.out.println("The " + garden.get(i).color + " Tree's thirstlevel is " + garden.get(i).thirstLevel);
      }
    }
  }
}

