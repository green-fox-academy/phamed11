package com.greenfoxacademy;

import java.security.PublicKey;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    Pirate pirate = new Pirate("Steve");
    Pirate pirate2 = new Pirate("Joseph");
    Pirate piri = new Pirate();
    Ship jianSeng = new Ship();

    jianSeng.fillShip();
    System.out.println(jianSeng.ourShip.size());
    for (int i = 0; i < jianSeng.ourShip.size(); i++) {
      System.out.println(jianSeng.ourShip.get(i).name);
    }


  }
}
