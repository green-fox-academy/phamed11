package com.greenfoxacademy.bankofsimba.Services;


import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankServices {

  void increaseBalance(int number);

  List<BankAccount> getAccounts();

  void addBankAccount(BankAccount account);

  void removeBankAccount(BankAccount account);

  BankAccount getAccountByName(String name);

}
