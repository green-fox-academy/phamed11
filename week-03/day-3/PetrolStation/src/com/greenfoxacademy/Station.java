package com.greenfoxacademy;

public class Station {
  int gasAmount;


  public Station() {
    gasAmount = 1000;
  }
  public void reFill(Car myCar) {
    this.gasAmount -= myCar.capacity;
    myCar.gasAmount += myCar.capacity;
  }

}
