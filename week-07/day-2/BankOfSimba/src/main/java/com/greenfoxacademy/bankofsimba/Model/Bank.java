package com.greenfoxacademy.bankofsimba.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {

  private List<BankAccount> bankAccountList;

  public Bank() {
    bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Scar", 322, "lion", false, true));
    bankAccountList.add(new BankAccount("Zazu", 3000, "parrot", false, true));
    bankAccountList.add( new BankAccount("Nala", 234, "lion", false, false));
    bankAccountList.add(new BankAccount("Simba", 10000, "lion", true, true));
  }

  public List<BankAccount> getBankAccountList() {
    return bankAccountList;
  }

  public void setBankAccountList(List<BankAccount> bankAccountList) {
    this.bankAccountList = bankAccountList;
  }
}
