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
  public void increaseBalance(int number) {
    if (nationalZooBank.getBankAccountList().get(number).getIsKing()) {
      nationalZooBank.getBankAccountList().get(number).setBalance(nationalZooBank.getBankAccountList().get(number).getDoubleBalance() + 100);
    } else {
      nationalZooBank.getBankAccountList().get(number).setBalance(nationalZooBank.getBankAccountList().get(number).getDoubleBalance() + 10);

    }
  }

  @Override
  public List<BankAccount> getAccounts() {
    return nationalZooBank.getBankAccountList();
  }

  @Override
  public void addBankAccount(BankAccount account) {
    getAccounts().add(account);
  }

  @Override
  public void removeBankAccount(BankAccount account) {
    getAccounts().remove(account);
  }

  @Override
  public BankAccount getAccountByName(String name) {
    int index = 0;
    for (int i = 0; i < nationalZooBank.getBankAccountList().size(); i++) {
      if (name.equals(nationalZooBank.getBankAccountList().get(i).getName())) {
        index = i;
      }
    }
    return nationalZooBank.getBankAccountList().get(index);
  }
}
