package com.greenfoxacademy.bankofsimba.Services;


import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankServices {

  void increaseBalance(int number);

  List<BankAccount> getAccounts();

  void addBankAccount(String name, String animalType, Double balance, boolean isKing, boolean isGoodGuy);

  void removeBankAccount(BankAccount account);

  BankAccount getAccountByName(String name);

}
