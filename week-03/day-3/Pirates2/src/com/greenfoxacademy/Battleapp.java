package com.greenfoxacademy;

import com.sun.imageio.plugins.png.PNGImageReader;

import java.security.PublicKey;
import java.util.Arrays;

public class Battleapp {

  public static void main(String[] args) {


    Ship jianSeng = new Ship();
    Ship blackRose = new Ship();
    jianSeng.fillShip();
    blackRose.fillShip();

    jianSeng.statusOfOurShip();
    System.out.println();
    blackRose.statusOfOurShip();

    jianSeng.battle(blackRose);

    jianSeng.statusOfOurShip();
    System.out.println();
    blackRose.statusOfOurShip();








  }
}
