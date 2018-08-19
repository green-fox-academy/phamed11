package com.greenfoxacademy;

import java.util.ArrayList;

public class Ship {
  ArrayList<Pirate> ship = new ArrayList<>();
  Pirate captain = new Pirate("CAPTAIN");


  public Ship(Pirate captain) {
  this.captain = captain;
  captain.health = 1000;
  captain.thirst = 10;
  }

  public Ship() {

  }

  


}
