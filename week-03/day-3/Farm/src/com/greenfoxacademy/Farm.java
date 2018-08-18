package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
    ArrayList<Integer> hungerValues = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      hungerValues.add(list.get(i).hunger);
    }
    Collections.sort(hungerValues);
    Collections.reverse(hungerValues);
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).hunger == hungerValues.get(0)) {
        System.out.println("I am sorry " + list.get(i).name + " had to die!");
        list.remove(i);
        break;
      }
    }
  }
}


