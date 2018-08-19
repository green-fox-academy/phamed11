package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Pirate pirate = new Pirate("Jack");
    Pirate pirate2 = new Pirate("Joe");
    Pirate pirate3 = new Pirate("Johnny");
    PirateList SmartOnes = new PirateList();
    SmartOnes.pirates.add(pirate);
    SmartOnes.pirates.add(pirate2);
    SmartOnes.pirates.add(pirate3);


    System.out.println(pirate.health);
    System.out.println(pirate2.health);

    SmartOnes.brawl(pirate, pirate2);
    System.out.println(pirate.health);
    System.out.println(pirate2.health);






  }


}

