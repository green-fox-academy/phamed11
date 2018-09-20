package com.greenfoxacademy.foxtamagochi.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String getHome(){
    return "index";
  }

  @GetMapping("/login")
  public String loginPage(){
    return "login";
  }

  @PostMapping("/login")
  public String postLoginPage() {
    
  }
}
