package com.greenfoxacademy;

public class Helicopter extends Vehicle implements Flyable {

  @Override
  public String land() {
    return "on helipad";
  }

  @Override
  public String fly() {
    return "Flies with rotors";
  }

  @Override
  public String takeoff() {
    return "takes off from helipad";
  }
}
