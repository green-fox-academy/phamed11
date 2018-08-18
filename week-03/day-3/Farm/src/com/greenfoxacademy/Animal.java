package com.greenfoxacademy;

public class Animal {
  int hunger;
  int thirst;
  String name;

  public Animal(String name) {
    hunger = 50;
    thirst = 50;
    this.name = name;
  }

  public void eat() {
    hunger -= 1;
  }

  public void drink() {
    thirst -= 1;
  }

  public void play() {
    hunger += 1;
    thirst += 1;
  }
}
