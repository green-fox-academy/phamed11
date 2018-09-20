package com.greenfoxacademy.foxtamagochi.Controllers;

import com.greenfoxacademy.foxtamagochi.Repositories.FoxHorde;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
  private FoxHorde foxHorde = new FoxHorde();

  @GetMapping("/nutritionStore{name}")
  public String nutritionStore(@RequestParam(value = "name", required = false) String name, Model model) {
    model.addAttribute("name", foxHorde.getFoxByName(name));
    return "nutrition";
  }


  @PostMapping("/nutritionStore/{name}")
  public String nutritionStorePerFox(@RequestParam(value = "name", required = false) String name, Model model) {
    model.addAttribute("name", foxHorde.getFoxByName(name));
    return "redirect:/?name=" + name;
  }

}
