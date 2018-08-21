package com.greenfoxacademy;

import java.util.ArrayList;

public class AircraftCarrier {
  ArrayList<Aircraft> carrier = new ArrayList<>();
  int ammoStorageSize;
  int healthpoints;

  public AircraftCarrier(int ammoStorageSize, int healthpoints) {
    this.ammoStorageSize = ammoStorageSize;
    this.healthpoints = healthpoints;
  }

  public void addAircraft(Aircraft aircraft) {
    carrier.add(aircraft);
  }

  public void fill(Aircraft aircraft) {
    
  }

}
