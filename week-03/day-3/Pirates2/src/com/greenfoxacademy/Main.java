package com.greenfoxacademy;

import java.security.PublicKey;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {


    Ship jianSeng = new Ship();
    jianSeng.fillShip();
    jianSeng.captain.drinkSomeRum();
    jianSeng.slave.drinkSomeRum();
    jianSeng.slave.drinkSomeRum();
    jianSeng.ourShip.get(3).drinkSomeRum();
    jianSeng.slave.drinkSomeRum();
    jianSeng.slave.drinkSomeRum();
    jianSeng.slave.drinkSomeRum();

    jianSeng.statusOfOurShip();








  }
}
