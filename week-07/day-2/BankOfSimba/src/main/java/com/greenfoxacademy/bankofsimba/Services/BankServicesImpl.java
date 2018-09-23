package com.greenfoxacademy.bankofsimba.Services;

import com.greenfoxacademy.bankofsimba.Model.Bank;
import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServicesImpl implements BankServices {

  private Bank nationalZooBank;

  @Autowired
  public BankServicesImpl(Bank nationalZooBank) {
    this.nationalZooBank = nationalZooBank;
  }


  @Override
  public void increaseBalance(BankAccount account) {
    if (account.getIsKing()) {
      account.setBalance(Integer.parseInt(account.getBalance()) + 100);
    } else {
      account.setBalance(Integer.parseInt(account.getBalance() + 10));
    }
  }

  public List<BankAccount> getAccounts() {
    return nationalZooBank.getBankAccountList();
  }

  public void addBankAccount(BankAccount account) {
    getAccounts().add(account);
  }

  public void removeBankAccount(BankAccount account) {
    getAccounts().remove(account);
  }


}
