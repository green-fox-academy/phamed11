package com.greenfoxacademy.foxtamagochi.Controllers;

import com.greenfoxacademy.foxtamagochi.Modells.Fox;
import com.greenfoxacademy.foxtamagochi.Services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {



  @GetMapping("/")
  public String getHome(@RequestParam(value = "name", required = false) String name, Model model){
    model.addAttribute("name", name);
    return "index";
  }

  @GetMapping("/login")
  public String loginPage(){
    return "login";
  }

  @PostMapping("/login/{name}")
  public String postLoginPage(@RequestParam(value = "name", required = true) String name, Model model) {
  model.addAttribute("name", name);
  return "index";
  }
}