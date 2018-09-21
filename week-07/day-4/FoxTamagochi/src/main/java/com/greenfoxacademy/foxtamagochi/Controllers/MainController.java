package com.greenfoxacademy.foxtamagochi.Controllers;

import com.greenfoxacademy.foxtamagochi.Modells.Fox;
import com.greenfoxacademy.foxtamagochi.Repositories.FoxHorde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  @Autowired
  private FoxHorde foxHorde;

  @GetMapping("/")
  public String getHome(@RequestParam(value = "name", required = false) String name, Model model) {
    model.addAttribute("name", foxHorde.getFoxByName(name));
    if (name == null) {
      return "login";
    }
    return "index";
  }

  @GetMapping("/login")
  public String loginPage() {
    return "login";
  }

  @PostMapping("/login/")
  public String postLoginPage(@RequestParam(value = "name") String name, Model model) {
    model.addAttribute("name", name);
    if (foxHorde.getFoxByName(name).getName().equals(name)) {
      return "redirect:/?name=" + name;
    }
    foxHorde.createFoxaddToFoxHorde(name);
    return "redirect:/?name=" + name;
  }
}

