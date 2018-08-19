package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Random;

public class Ship {
  ArrayList<Pirate> ourShip = new ArrayList<>();
  Pirate captain = new Pirate();
  Pirate slave = new Pirate();

  public Ship() {
  captain.health = 1000;
  }



  public ArrayList fillShip() {
    Random random = new Random();
    int ran = random.nextInt(100);
    ourShip.add(0, captain);
    for (int i = 1; i < 4; i++) {
      ourShip.add(i, slave);
      ourShip.get(0).name = "The Captain";
    }
    return ourShip;
  }

  public String randomName() {
    String name = "";
    Random random = new Random();
    int ran = random.nextInt(344);
    for (int i = 1; i < ourShip.size(); i++) {
      name = "Pirate " + ran;
    }
    return name;
  }
}


