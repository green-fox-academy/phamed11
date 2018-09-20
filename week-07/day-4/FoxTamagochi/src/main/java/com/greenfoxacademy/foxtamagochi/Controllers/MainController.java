package com.greenfoxacademy.foxtamagochi.Controllers;

import com.greenfoxacademy.foxtamagochi.Modells.Fox;
import com.greenfoxacademy.foxtamagochi.Repositories.FoxHorde;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private FoxHorde foxHorde = new FoxHorde();

  @GetMapping("/")
  public String getHome(@RequestParam(value = "name", required = false) String name, Model model) {
    model.addAttribute("trick", foxHorde.getFoxByName(name).getNumberOfTricks());
    model.addAttribute("trickname", foxHorde.getFoxByName(name).getListOfTricks());
    model.addAttribute("drink", foxHorde.getFoxByName(name).getDrink());
    model.addAttribute("food", foxHorde.getFoxByName(name).getFood());
    model.addAttribute("knowstricks", foxHorde.getFoxByName(name).knowsTricks());
    model.addAttribute("name", name);
    return "index";
  }

  @GetMapping("/login")
  public String loginPage() {
    return "login";
  }

  @PostMapping("/login/{name}")
  public String postLoginPage(@RequestParam(value = "name", required = true) String name, Model model) {
    model.addAttribute("name", name);
    for (Fox fox : foxHorde.getFoxes()) {
      if (fox.getName().equals(name)) {
        return "redirect:/?name=" + name;
      }
    }
    return "redirect:/login";
  }
}

