package com.greenfoxacademy;

import java.util.ArrayList;

public class AircraftCarrier {
  ArrayList<Aircraft> carrier = new ArrayList<>();
  int ammoStorageSize;
  int healthPoints;

  public AircraftCarrier(int ammoStorageSize, int healthPoints) {
    this.ammoStorageSize = ammoStorageSize;
    this.healthPoints = healthPoints;
  }

  public void addAircraft(Aircraft aircraft) {
    carrier.add(aircraft);
  }

  // this is not good yet!!!
  public void fill() {
    if (this.totalAmmoNeeded() > ammoStorageSize) {
      for (int i = 0; i < carrier.size(); i++) {
        if (carrier.get(i).isPriority()) {
          ammoStorageSize = carrier.get(i).reFill(ammoStorageSize);
        } else {
//          ammoStorageSize = carrier.get(i).reFill(ammoStorageSize);
        }
      }
    } else {
      for (int i = 0; i < carrier.size(); i++) {
        ammoStorageSize = carrier.get(i).reFill(ammoStorageSize);
      }
    }
  }

  public int totalAmmoNeeded() {
    int totalNeeded = 0;
    for (int i = 0; i < carrier.size(); i++) {
      totalNeeded += carrier.get(i).ammoNeeded();
    }
    return totalNeeded;
  }

  public void listOfAircraftsOnCarrier() {
    for (int i = 0; i < carrier.size(); i++) {
      System.out.println(carrier.get(i).getStatus());
    }
  }


}
