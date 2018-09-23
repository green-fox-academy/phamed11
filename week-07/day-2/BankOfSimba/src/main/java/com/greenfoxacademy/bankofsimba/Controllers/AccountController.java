package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Services.BankServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController {

  private BankServices bankServices;

  @Autowired
  public AccountController(BankServices bankServices) {
    this.bankServices = bankServices;
  }


  @GetMapping("/bank")
  public String showAllBankAccounts(Model model) {
    model.addAttribute("bank", bankServices.getAccounts());
    return "bank";
  }

  @PostMapping("/increase")
  public String addToBalance(@RequestParam(value = "index", required = false) int index) {
  bankServices.increaseBalance(index);
    return ("redirect:/bank");
  }


//  @GetMapping("/show")
//  public String showsBankAccount(Model model) {
//    model.addAttribute("bankAccount", bankServices.);
//    return "show";
//  }
//
//  @GetMapping("/hello")
//  public String hello(Model model) {
//    String message = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
//    model.addAttribute("hello", message);
//    model.addAttribute("bankAccount", bankAccount);
//    return "show";
//  }

}
