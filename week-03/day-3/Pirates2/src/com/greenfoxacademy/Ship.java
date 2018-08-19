package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Random;

public class Ship {
  ArrayList<Pirate> ourShip = new ArrayList<>();
  Pirate captain = new Pirate();
  Pirate slave = new Pirate();

  public Ship() {
    captain.health = 100;
  }


  public ArrayList fillShip() {
    Random random = new Random();
    int ran = random.nextInt(100);
    ourShip.add(0, captain);
    for (int i = 1; i < ran; i++) {
      ourShip.add(i, slave);
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
    System.out.println("We have " + (ourShip.size() - 1) + " pirates on board plus our captain");
    System.out.println();
    System.out.println("Our captain drank RUM " + ((20 - ourShip.get(0).thirst)) + " times. His health is " + ourShip.get(0).health + " %.");
    System.out.println();
    int dead = 0;
    for (int i = 0; i < ourShip.size(); i++) {
      if (ourShip.get(i).health == 0) {
        dead++;
      }
    }
    System.out.println("We have " + dead + " dead pirates.");
    System.out.println("We have " + alivePirates() + " alive pirates");
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
    boolean result = true;
    Random random = new Random();
    int theirLoss = random.nextInt(other.ourShip.size() - 1);
    int outLoss = random.nextInt(ourShip.size() - 1);
    int rum = random.nextInt(3);
    if (alivePirates() - consumedRumbyTheCaptain() > other.alivePirates() - consumedRumbyTheCaptain()) {
      result = true;
    } else {
      result = false;
    }
    if (result = true) {
      for (int i = 0; i < other.ourShip.size(); i++) {
        other.ourShip.remove(i);
      }
      for (int i = 0; i < rum ; i++) {
        other.captain.drinkSomeRum();
        other.slave.drinkSomeRum();
      }
    } else {
      for (int i = 0; i < ourShip.size(); i++) {
        ourShip.remove(i);
      }
      for (int i = 0; i < rum ; i++) {
        captain.drinkSomeRum();
        slave.drinkSomeRum();
      }
    }
    return result;
  }
}



