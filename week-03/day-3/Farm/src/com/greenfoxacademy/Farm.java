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
    int[] swap = new int[hungerValues.length];
    for (int i = 0; i < list.size() - 1; i++) {
      hungerValues[i] = list.get(i).hunger;
    }
    Arrays.sort(hungerValues);
    for (int i = 0; i < hungerValues.length; i++) {
      swap[i] = hungerValues[hungerValues.length - 1 - i];
    }
    list.remove(list.get(hungerValues[0]));
    System.out.println("I am sorry " + list.get(hungerValues[0]).name + " had to die");
  }

}


