package com.greenfoxacademy;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class PirateList {
  ArrayList<Pirate> pirates = new ArrayList<Pirate>();
  ArrayList<Pirate> deadPirates = new ArrayList<Pirate>();

  public PirateList() {

  }

  public void shout() {
    System.out.println("Ima Pirate");
  }

  public void whoIsAlive() {
    for (int i = 0; i < pirates.size(); i++) {
      System.out.println(pirates.get(i).name + " is alive!");
    }
  }

  public void die(Pirate pirate) {
    deadPirates.add(pirate);
    pirates.remove(pirates.indexOf(pirate.name));
    System.out.println(pirate.name + " is dead! :(");

  }

  public void whoIsDead() {
    if (deadPirates.size() > 0) {
      for (int i = 0; i < deadPirates.size(); i++) {
        System.out.println(deadPirates.get(i).name + " is dead!");
      }
    } else {
      System.out.println("Nobody is dead! Horray");
    }
  }
}
