package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {

    Pirate pirate = new Pirate("Steve");
    Pirate pirate2 = new Pirate("Joseph");
    pirate.die(pirate2);
    pirate.die(pirate);

    pirate.brawl(pirate, pirate2);

  }
}
