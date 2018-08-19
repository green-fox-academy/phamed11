//package com.greenfoxacademy;
//
//import java.util.ArrayList;
//import java.util.Random;
//
//public class Pirate {
//  int thirst;
//  String name;
//  int health;
//
//
//  public Pirate(String name) {
//    health = 100;
//    thirst = 4;
//    this.name = name;
//  }
//  public Pirate() {
//    health = 100;
//    thirst = 10;
//  }
//
//
//  public void drinkSomeRum() {
//    if (thirst > 0 && health > 0) {
//      System.out.println("Pour me anudder!");
//    } else if (health == 0) {
//      System.out.println("he is dead, he doesn't need a drink :(");
//    } else {
//      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
//    }
//    thirst--;
//  }
//
//  public static void die(Pirate pirate) {
//    pirate.health = 0;
//    System.out.println(pirate.name + " is dead! :(");
//    System.out.println();
//  }
//
//  public static void brawl(Pirate one, Pirate two) {
//    Random random = new Random();
//    int luck = random.nextInt(3);
//    if (luck == 0 && one.health > 0 && two.health > 0) {
//      die(one);
//      System.out.println(one.name + " was killed by " + two.name);
//    } else if (luck == 0 && one.health == 0 && two.health > 0) {
//      System.out.println(one.name + " is already dead, he cannot fight!");
//    } else if (luck == 0 && one.health > 0 && two.health == 0) {
//      System.out.println(two.name + " is already dead, he cannot fight!");
//    } else if (luck == 0 && one.health == 0 && two.health == 0) {
//      System.out.println("Why would two dead pirates fight??? You insane?");
//    } else if (luck == 1 && two.health > 0 && one.health > 0) {
//      die(two);
//      System.out.println(two.name + " was killed by " + one.name);
//    } else if (luck == 1 && two.health == 0 && one.health > 0) {
//      System.out.println(two.name + " is already dead, he cannot fight!");
//    } else if (luck == 1 && one.health == 0 && two.health > 0) {
//      System.out.println(one.name + " is already dead, he cannot fight!");
//    } else if (luck == 1 && one.health == 0 && two.health == 0) { // i dont get why is this always false, because it isnt
//      System.out.println("Why would two dead pirates fight??? You insane?");
//    } else if (luck == 2 && one.health > 0 && two.health > 0) {
//      one.health -= 10;
//      two.health -= 10;
//      System.out.println(one.name + " and " + two.name + " are passed out.");
//    } else if (luck == 2 && one.health > 0 && two.health == 0) {
//      System.out.println(two.name + " is already dead, he cannot fight!");
//    } else if (luck == 2 && one.health == 0 && two.health > 0) {
//      System.out.println(one.name + " is already dead, he cannot fight!");
//    } else if (luck == 2 && one.health == 0 && two.health == 0) {
//      System.out.println("Why would two dead pirates fight??? You insane?");
//    }
//  }
//}
