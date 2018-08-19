package com.greenfoxacademy;

import com.sun.imageio.plugins.png.PNGImageReader;

import java.security.PublicKey;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {


    Ship jianSeng = new Ship();
    jianSeng.fillShip();


    Pirate pirate = new Pirate();
    Pirate pirate1 = new Pirate();

    pirate.brawl(pirate, pirate1);



  }
}
