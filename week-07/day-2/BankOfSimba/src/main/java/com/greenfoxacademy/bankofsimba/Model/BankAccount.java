package com.greenfoxacademy.bankofsimba.Model;


public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean isAKing;
  private boolean isAGoodGuy;

  public BankAccount() {
  }

  public BankAccount(String name, double balance, String animalType, boolean isAKing, boolean isAGoodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isAKing = isAKing;
    this.isAGoodGuy= isAGoodGuy;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBalance() {
    return String.format("%.2f", balance) + " zebra";
  }

  public double getDoubleBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public String isAKing() {
    if (isAKing) {
      return "King";
    }
    return "Food";
  }

  public boolean getIsKing() {
    return isAKing;
  }


  public void setAKing(boolean AKing) {
    isAKing = AKing;
  }

  public String isAGoodGuy() {
    if (isAGoodGuy) {
      return "He is a Good guy!";
    }
    return "He is EVIL!!!";
  }

  public void setAGoodGuy(boolean AGoodGuy) {
    isAGoodGuy = AGoodGuy;
  }
}
