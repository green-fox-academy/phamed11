package com.greenfoxacademy.foxtamagochi.Modells;


import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private String food;
  private String drink;
  List<Tricks> listOfTricks;

  public Fox() {
  }

  public Fox(String name) {
    this.name = name;
    listOfTricks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<Tricks> getListOfTricks() {
    return listOfTricks;
  }

  public void setListOfTricks(List<Tricks> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }
}
