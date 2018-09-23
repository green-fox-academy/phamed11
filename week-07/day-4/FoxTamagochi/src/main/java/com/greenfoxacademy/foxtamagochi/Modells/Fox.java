package com.greenfoxacademy.foxtamagochi.Modells;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Fox {
  private String name;
  private String food;
  private String drink;

  public List<String> getListOfTricks() {
    return listOfTricks;
  }
  List<String> listOfTricks;

  public Fox() {
    listOfTricks = new ArrayList<>();
  }

  public Fox(String name) {
    this.name = name;
    food = "Minimal wage";
    drink = "water";
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

  public int getNumberOfTricks() {
    return listOfTricks.size();
  }

  public boolean knowsTricks() {
    return !(listOfTricks.size() == 0);
  }

  public List<String> addTrick(String trick) {
    if (listOfTricks.contains(trick)) {
      return getListOfTricks();
    }
    listOfTricks.add(trick);
    return getListOfTricks();
  }


}
