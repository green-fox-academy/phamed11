package com.greenfoxacademy;

import com.greenfox.*;

public class Main {

  public static void main(String[] args) {
    Helicopter roto = new Helicopter();
    Bird pipi = new Bird("Dr. Bubo");

    System.out.println(pipi.fly());
    System.out.println(roto.fly());
    System.out.println(roto.land());
    System.out.println(roto.takeoff());

  }
}
