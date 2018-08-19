package com.greenfoxacademy;

public class Pirate {
  int thirst;
  String name;



  public Pirate(String name) {
    thirst = 4;
    this.name = name;
  }


  public void drinkSomeRum() {
    if (thirst > 0) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
    thirst--;
  }

}


