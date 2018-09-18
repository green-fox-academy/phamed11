package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Model.Bank;
import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

  private Bank zooBank = new Bank();
  private BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", true);


  @GetMapping("/show")
  public String showsBankAccount(Model model) {
    model.addAttribute("bankAccount", bankAccount);
    return "show";
  }

  @GetMapping("/hello")
  public String hello(Model model) {
    String message = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("hello", message);
    model.addAttribute("bankAccount", bankAccount);
    return "show";
  }

  @GetMapping("/bank")
  public String showAllBankAccounts(Model model) {
    model.addAttribute("bank", zooBank.getBankAccountList());
    return "bank";
  }


}
