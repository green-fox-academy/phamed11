package com.greenfox;

public abstract class Animal {
  String name;
  int age;
  String gender;
  String favouriteFood;
  int numberOfLegs;
  String soundsLike;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract String breed();
}
