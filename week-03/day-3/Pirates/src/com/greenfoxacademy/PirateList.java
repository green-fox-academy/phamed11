package com.greenfoxacademy;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

import static jdk.nashorn.internal.objects.NativeMath.random;

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
    System.out.println();
  }

  public void die(Pirate pirate) {
    pirate.health = 0;
    deadPirates.add(pirate);
    pirates.remove(pirate);
    System.out.println(pirate.name + " is dead! :(");
    System.out.println();

  }

  public void whoIsDead() {
    if (deadPirates.size() > 0) {
      for (int i = 0; i < deadPirates.size(); i++) {
        System.out.println("\n" + deadPirates.get(i).name + " is dead!");
      }
    } else {
      System.out.println("\n Nobody is dead! Horray");
      System.out.println();
    }
  }

  public void brawl(Pirate one, Pirate two) {
    Random random = new Random(2);
    int luck = random.nextInt(3);
    if (luck == 0 && one.health > 0) {
      die(one);
    } else if (luck == 0 && one.health == 0) {
      System.out.println(one.name + " is already dead");
    } else if (luck == 1 && two.health > 0) {
      die(two);
    } else if (luck == 1 && two.health == 0) {
      System.out.println(two.name + " is already dead");
    } else if (luck == 2 && one.health > 0 && two.health > 0) {
      one.health -= 10;
      two.health -= 10;
      System.out.println(one.name + " and " + two.name + " are passed out.");
    } else if (luck == 2 && one.health > 0 && two.health == 0) {
      System.out.println(two.name + " is already dead");
    } else if (luck == 2 && one.health == 0 && two.health > 0) {
      System.out.println(one.name + " is already dead");
    } else if (luck == 2 && one.health == 0 && two.health == 0) {
      System.out.println("Why would two dead pirates fight??? You insane?");
    }
  }
}
