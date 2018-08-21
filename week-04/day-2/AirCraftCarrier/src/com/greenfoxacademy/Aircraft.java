package com.greenfoxacademy;

public class Aircraft {
  int ammo;
  int baseDamage;
  int maxAmmo;
  String type;

  public Aircraft(int ammo, int baseDamage, int maxAmmo) {
    this.ammo = ammo;
    this.baseDamage = baseDamage;
    this.maxAmmo = maxAmmo;
  }

  public int fight() {
    int totaldamage = this.ammo * this.baseDamage;
    return totaldamage;
  }

  public int reFill(int ammoToAdd) {
    int ammoToFill = maxAmmo - ammo;
    if (ammo < maxAmmo) {
      if (ammoToAdd < ammoToFill) {
        ammo += ammoToAdd;
        ammoToAdd = 0;
      } else {
        ammo = maxAmmo;
        ammoToAdd = ammoToAdd - ammoToFill;
      }
    }
    return ammoToAdd;
  }

  public String getType() {
    return this.type;
  }

  public String getStatus() {
    return "Type " + getType() + ", Ammo: " + this.ammo + ", Base Damage: " + this.baseDamage + ", All Damage: " + fight();
  }

  public int ammoNeeded() {
    int ammoNeeded = this.maxAmmo - this.ammo;
    return ammoNeeded;
  }

  public boolean isPriority() {
    if (this.type.equals("F-35")) {
      return true;
    } else {
      return false;
    }
  }

}
