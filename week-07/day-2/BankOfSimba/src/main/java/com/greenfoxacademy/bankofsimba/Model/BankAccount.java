package com.greenfoxacademy.bankofsimba.Model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;

  public BankAccount() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBalance() {
    return String.format("%.2f", balance) + " Zebra";
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

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;


  }
}
