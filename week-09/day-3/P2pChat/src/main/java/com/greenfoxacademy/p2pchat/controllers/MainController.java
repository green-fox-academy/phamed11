package com.greenfoxacademy.p2pchat.controllers;

import com.greenfoxacademy.p2pchat.services.MainServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  private MainServices mainServices;

  @Autowired
  public MainController(MainServices mainServices) {
    this.mainServices = mainServices;
  }

  @GetMapping("/")
  public String mainPage() {
    return "index";
  }

}
