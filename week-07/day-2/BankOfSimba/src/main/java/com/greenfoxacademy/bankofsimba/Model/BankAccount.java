package com.greenfoxacademy.bankofsimba.Model;

public class BankAccount {
  private String name;
  private String balance;
  private String animalType;

  public BankAccount() {
  }

  public BankAccount(String name, String balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }
}
