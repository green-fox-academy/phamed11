package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Random;

public class Pirate {
  int thirst;
  int health;


  public Pirate() {
    health = 100;
    thirst = 20;
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

  public int die() {
    health = 0;
    System.out.println(" is dead! :(");
    System.out.println();
    return health;
  }

  public void brawl(Pirate enemy) {
    Random random = new Random();
    int luck = random.nextInt(3);
    if (luck == 0 && health > 0 && enemy.health > 0) { health = 0;
      System.out.println("He is dead");
    } else if (luck == 0 && health == 0 && enemy.health > 0) {
      System.out.println(" is already dead, he cannot fight!");
    } else if (luck == 0 && health > 0 && enemy.health == 0) {
      System.out.println(" is already dead, he cannot fight!");
    } else if (luck == 0 && health == 0 && enemy.health == 0) {
      System.out.println("Why would enemy dead pirates fight??? You insane?");
    } else if (luck == 1 && enemy.health > 0 && health > 0) {
      enemy.health = 0;
      System.out.println("The other is dead.");
    } else if (luck == 1 && enemy.health == 0 && health > 0) {
      System.out.println(" is already dead, he cannot fight!");
    } else if (luck == 1 && health == 0 && enemy.health > 0) {
      System.out.println(" is already dead, he cannot fight!");
    } else if (luck == 1 && health == 0 && enemy.health == 0) { // i dont get why is this always false, because it isnt
      System.out.println("Why would dead pirates fight??? You insane?");
    } else if (luck == 2 && health > 0 && enemy.health > 0) { health -= 10;
      enemy.health -= 10;
      System.out.println("They both passed out.");
    } else if (luck == 2 && health > 0 && enemy.health == 0) {
      System.out.println(" is already dead, he cannot fight!");
    } else if (luck == 2 && health == 0 && enemy.health > 0) {
      System.out.println(" is already dead, he cannot fight!");
    } else if (luck == 2 && health == 0 && enemy.health == 0) {
      System.out.println("Why would dead pirates fight??? You insane?");
    }
  }
}
