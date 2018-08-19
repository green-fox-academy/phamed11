package com.greenfoxacademy;

import java.util.ArrayList;

public class Pirate {
  int thirst;
  String name;
  int health;


  public Pirate(String name) {
    health = 100;
    thirst = 4;
    this.name = name;
  }


  public void drinkSomeRum() {
    if (thirst > 0 && health > 0) {
      System.out.println("Pour me anudder!");
    } else if (health == 0) {
      System.out.println("he is dead, he doesn't need a drink :(");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
    thirst--;
  }




}


