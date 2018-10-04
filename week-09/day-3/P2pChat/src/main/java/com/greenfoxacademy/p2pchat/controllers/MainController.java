package com.greenfoxacademy.p2pchat.controllers;

import com.greenfoxacademy.p2pchat.models.User;
import com.greenfoxacademy.p2pchat.services.MainServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

  private MainServices mainServices;

  @Autowired
  public MainController(MainServices mainServices) {
    this.mainServices = mainServices;
  }

  @GetMapping("/")
  public String mainPage(HttpServletRequest request, Model model) {
    if (mainServices.getAllUsers().size() == 0) {
      return "redirect:/register";
    }
    model.addAttribute("errormain", "");
    model.addAttribute("user", mainServices.findUserById(1L).getUsername());
    mainServices.createLog(request, "INFO", "");
    return "index";
  }

  @GetMapping("/register")
  public String register(Model model, HttpServletRequest request) {
    model.addAttribute("error", "");
    mainServices.createLog(request, "INFO", "");
    return "register";
  }

  @PostMapping("/register")
  public String registerIn(@RequestParam(value = "username", required = false) String username, Model model, HttpServletRequest request) {
    if (username == null || username.isEmpty()) {
      model.addAttribute("error", "The username field is empty");
      mainServices.createLog(request, "ERROR", "The username field is empty!");
      return "register";
    }
    User user = new User(username);
    mainServices.saveUser(user);
    mainServices.createLog(request, "INFO", user.toString());
    return "redirect:/";
  }


  @PostMapping("/update")
  public String updateUser(Model model, @RequestParam(value = "username") String username, HttpServletRequest request) {
    if (username == null || username.isEmpty()) {
      model.addAttribute("errormain", "The username field is empty");
      mainServices.createLog(request, "ERROR", "The username field is empty!");
      return "index";
    }
    mainServices.updateUser(username);
    mainServices.createLog(request, "INFO", mainServices.findUserById(1L).toString());
    return "redirect:/";
  }



}
