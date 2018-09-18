package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

  @GetMapping("/show")
  public String showsBankAccount() {
    BankAccount bankAccount = new BankAccount("Simba", "2000", "lion");
    return "show";
  }

}
