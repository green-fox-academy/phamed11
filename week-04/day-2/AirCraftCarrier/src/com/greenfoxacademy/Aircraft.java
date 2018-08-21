package com.greenfoxacademy;

public class Aircraft {
  int ammo;
  int baseDamage;
  int MaxAmmo;
  String type;

  public Aircraft(int ammo, int baseDamage, int maxAmmo) {
    this.ammo = ammo;
    this.baseDamage = baseDamage;
    this.MaxAmmo = maxAmmo;
  }

  public int fight() {
    int totaldamage = this.ammo * this.baseDamage;
    return totaldamage;
  }

  public int reFill(int ammoToAdd) {
    ammo 
  }

}
