package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

  @GetMapping("/show")
  public String showsBankAccount(Model model) {
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    return "show";
  }

}
