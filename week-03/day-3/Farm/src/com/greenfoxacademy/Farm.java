package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;

public class Farm {
  ArrayList<Animal> list = new ArrayList<>();
  int slots;

  public Farm(int slots) {
    this.slots = slots;
  }


  public void breed(Animal newAnimal, String name) {
    if (list.size() < slots) {
      newAnimal = new Animal(name);
      list.add(newAnimal);
    } else {
      System.out.println("There is NO space for a new animal");
    }

  }

  public void slaughter() {
    int[] hungerValues = new int[list.size()];
    for (int i = 0; i < list.size() - 1; i++) {
      hungerValues[i] = list.get(i).hunger;
    }
    Arrays.sort(hungerValues);
    list.remove(list.get(hungerValues[0]));
  }

}


