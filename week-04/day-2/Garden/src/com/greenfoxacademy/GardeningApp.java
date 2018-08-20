package com.greenfoxacademy;

public class GardeningApp extends Garden {

  public GardeningApp() {
  }

  public void start(Garden name) {
    name.status();
    System.out.println();
    name.watering(40);
    System.out.println();
    name.watering(70);
    System.out.println();
  }
}
