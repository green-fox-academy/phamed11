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
      System.out.println("\nHello " + list.get(list.size() - 1).name + ", welcome to my farm.");
    } else {
      System.out.println("\nThere is NO space for a new animal!!!!");
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
        System.out.println("\nI am sorry " + list.get(i).name + " had to die!\n\n BUT: ");
        System.out.println();
        whoIsAlive();
        list.remove(i);
        break;
      }
    }
  }

  public void whoIsAlive() {
    for (int i = 0; i < list.size(); i++) {
      System.out.println((list.get(i).name + " is still alive and well."));
    }
  }

  public void hungerLevels() {
    for (int i = 0; i < list.size(); i++) {
      System.out.println((i + 1) + ". The " + list.get(i).name + "'s hunger level is: " + list.get(i).hunger);
    }
  }
  public void numberOfAnimals() {
    System.out.println("\nThis farm has : " + list.size() + " animals");
  }
}


