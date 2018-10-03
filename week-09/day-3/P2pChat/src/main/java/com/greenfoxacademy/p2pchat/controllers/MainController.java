package com.greenfoxacademy.p2pchat.controllers;

import com.greenfoxacademy.p2pchat.models.Log;
import com.greenfoxacademy.p2pchat.models.User;
import com.greenfoxacademy.p2pchat.services.MainServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private MainServices mainServices;

  @Autowired
  public MainController(MainServices mainServices) {
    this.mainServices = mainServices;
  }

  @GetMapping("/")
  public String mainPage() {
    Log log = new Log("/", "GET", "INFO", "");
    mainServices.saveLog(log);
    System.out.println(mainServices.printLog(log));
    return "index";
  }

  @GetMapping("/register")
    public String register() {
    Log log = new Log("/register", "GET", "INFO", "");
    mainServices.saveLog(log);
    System.out.println(mainServices.printLog(log));
      return "register";
    }

  @PostMapping ("/register")
  public String registerIn(@RequestParam(value = "username", required = false) String username) {
    User user = new User(username);
    mainServices.saveUser(user);
    Log log = new Log("/register", "POST", "INFO", user.toString());
    mainServices.saveLog(log);
    System.out.println(mainServices.printLog(log));
    return "register";
  }

}
