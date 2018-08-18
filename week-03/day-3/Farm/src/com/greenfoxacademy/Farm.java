package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;

public class Farm {
  ArrayList<Animal> list = new ArrayList<>();
  int slots;

  public Farm(){
    this.slots = 10;

  }
  public void breed(Animal newAnimal) {
    if (list.size() < slots) {
      newAnimal = new Animal();
      list.add(newAnimal);
    } else {
      System.out.println("There is space for a new animal");
    }

  }

  public void slaughter() {
    int[] hungerValues = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      hungerValues[i] = list.get(i).hunger;
    }
    Arrays.sort(hungerValues);
    list.remove(list.get(hungerValues[hungerValues.length]));
  }

}


