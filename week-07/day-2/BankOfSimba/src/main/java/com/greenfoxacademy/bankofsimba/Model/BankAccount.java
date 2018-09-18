package com.greenfoxacademy.bankofsimba.Model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean isAKing;

  public BankAccount() {
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

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public BankAccount(String name, double balance, String animalType, boolean isAKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isAKing = isAKing;
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
}
