package com.greenfoxacademy.foxtamagochi.Controllers;

import com.greenfoxacademy.foxtamagochi.Repositories.FoxHorde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
  @Autowired
  private FoxHorde foxHorde;

  @GetMapping("/nutritionStore")
  public String nutritionStore(@RequestParam(value = "name", required = false) String name, Model model) {
    model.addAttribute("name", foxHorde.getFoxByName(name));
    return "nutrition";
  }


  @PostMapping("/nutritionStore")
  public String nutritionStorePerFox(@RequestParam(value = "name", required = false) String name,
                                     @ModelAttribute(value = "food") String food, @ModelAttribute(value = "drink") String drink){
    foxHorde.getFoxByName(name).setDrink(drink);
    foxHorde.getFoxByName(name).setFood(food);
    return "redirect:/?name=" + name;
  }
}
