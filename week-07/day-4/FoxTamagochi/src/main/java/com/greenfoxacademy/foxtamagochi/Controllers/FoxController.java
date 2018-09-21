package com.greenfoxacademy.foxtamagochi.Controllers;

import com.greenfoxacademy.foxtamagochi.Repositories.FoxHorde;
import com.greenfoxacademy.foxtamagochi.Services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

  private FoxService foxService;

  @Autowired
  public FoxController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/nutritionStore")
  public String nutritionStore(@RequestParam(value = "name", required = false) String name, Model model) {
    model.addAttribute("name", foxService.loginFox(name));
    return "nutrition";
  }


  @PostMapping("/nutritionStore")
  public String nutritionStorePerFox(@RequestParam(value = "name", required = false) String name,
                                     @ModelAttribute(value = "food") String food, @ModelAttribute(value = "drink") String drink) {
    foxService.loginFox(name).setDrink(drink);
    foxService.loginFox(name).setFood(food);
    return "redirect:/?name=" + name;
  }

  @GetMapping("/trickCenter")
  public String trickCenter(@RequestParam(value = "name", required = false) String name, Model model) {
    model.addAttribute("name", foxService.loginFox(name));
    return "trickcenter";
  }

  @PostMapping("/trickCenter")
  public String trickCenterAddTrick(@RequestParam(value = "name", required = false) String name, Model model, @ModelAttribute(value = "trick") String trick) {
    foxService.loginFox(name).addTrick(trick);
    return "redirect:/?name=" + name;
  }
}
