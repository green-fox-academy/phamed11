package com.greenfoxacademy.bankofsimba.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Bank {

  private List<BankAccount> bankAccountList;


  public Bank() {
    bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Scary", 322, "lion", false, true));
    bankAccountList.add(new BankAccount("Zazu", 3000, "parrot", false, true));
    bankAccountList.add( new BankAccount("Nala", 234, "lion", false, false));
    bankAccountList.add(new BankAccount("Simba", 10000, "lion", true, true));
  }

  public List<BankAccount> getBankAccountList() {
    return bankAccountList;
  }

}
