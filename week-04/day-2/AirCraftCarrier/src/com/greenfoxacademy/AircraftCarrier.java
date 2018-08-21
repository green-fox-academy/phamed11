package com.greenfoxacademy;

import javax.sound.midi.Soundbank;
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

  public void fill() {
    if (this.totalAmmoNeeded() > ammoStorageSize) {
      for (int i = 0; i < carrier.size(); i++) {
        if (carrier.get(i).isPriority()) {
          ammoStorageSize = carrier.get(i).reFill(ammoStorageSize);
        }
      }
      if (ammoStorageSize > 0) {
        for (int i = 0; i < carrier.size(); i++) {
          ammoStorageSize = carrier.get(i).reFill(ammoStorageSize);
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

  public int fight(AircraftCarrier enemy) {
    int damage = 0;
    for (int i = 0; i < carrier.size(); i++) {
      damage = enemy.healthPoints -= carrier.get(i).fight();
    }
    return damage;
  }

  public void getStatus() {
    int totalDamage = 0;
    for (int i = 0; i < carrier.size(); i++) {
      totalDamage += carrier.get(i).fight();
    }

    System.out.println("HP: " + this.healthPoints + ", Aircraft count: " + carrier.size() + ", Ammo Storage: " + this.ammoStorageSize +
                      ", Total damage: " + totalDamage);
    System.out.println("Aircrafts: ");
    listOfAircraftsOnCarrier();
  }
}
