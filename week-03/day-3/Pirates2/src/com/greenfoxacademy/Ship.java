package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Random;

public class Ship {
  ArrayList<Pirate> ourShip = new ArrayList<>();
  Pirate captain = new Pirate();
  Pirate slave = new Pirate();

  public Ship() {
//    slave.health = 90;
//    slave.thirst = 5;
//    slave.name = "Nobody";
//    captain.health = 1000;
//    captain.thirst = 10;
//    captain.name = "Black Eye";

  }


//  public Ship(Pirate captain) {
//    this.captain = captain;
//    captain.health = 1000;
//    captain.thirst = 10;
//
//  }

  public ArrayList fillShip() {
    Random random = new Random();
    int ran = random.nextInt(100);
    ourShip.add(captain);
    for (int i = 0; i < ran; i++) {
      ourShip.add(i, slave);
    }
    return ourShip;
  }
}


