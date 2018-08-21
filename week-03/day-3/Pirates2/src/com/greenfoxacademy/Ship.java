package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Random;

public class Ship {
  ArrayList<Pirate> ourShip = new ArrayList<>();
  Pirate captain = new Pirate();

  public Ship() {
    captain.health = 100;
  }


  public ArrayList fillShip() {
    Random random = new Random();
    int ran = 30 + random.nextInt((100 - 30) + 1);
    ourShip.add(0, captain);
    for (int i = 1; i < ran; i++) {
      ourShip.add(i, new Pirate()); // this is important to remember
    }
    return ourShip;
  }

  //  public String randomName() {
//    String name = "";
//    Random random = new Random();
//    int ran = random.nextInt(344);
//    for (int i = 1; i < ourShip.size(); i++) {
//      name = "Pirate " + ran;
//    }
//    return name;
//  }
  public void statusOfOurShip() {
    System.out.println("We have " + alivePirates() + " alive pirates");
    System.out.println("Our captain drank " + consumedRumbyTheCaptain() + " rums.");
  }

  public int alivePirates() {
    int alive = 0;
    for (int i = 0; i < ourShip.size(); i++) {
      if (ourShip.get(i).health > 0) {
        alive++;
      }
    }
    return alive;
  }

  public int consumedRumbyTheCaptain() {
    int rum = 20 - ourShip.get(0).thirst;
    return rum;

  }

  public boolean battle(Ship other) {
    boolean result;
    Random random = new Random();
    int loss = random.nextInt(20);
    int rum = random.nextInt(5);
    if (alivePirates() - consumedRumbyTheCaptain() > other.alivePirates() - other.consumedRumbyTheCaptain()) {
      for (int i = 1; i < loss; i++) {
        other.ourShip.remove(i);
      }
      for (int i = 0; i < rum ; i++) {
        captain.drinkSomeRum();
        ourShip.get(i).drinkSomeRum();
      }
    } else {
      for (int i = 1; i < loss; i++) {
        ourShip.remove(i);
      }
      for (int i = 0; i < rum ; i++) {
        other.captain.drinkSomeRum();
        other.ourShip.get(i).drinkSomeRum();
      }
    }
    return (alivePirates() - consumedRumbyTheCaptain() < other.alivePirates() - other.consumedRumbyTheCaptain());
  }
}



