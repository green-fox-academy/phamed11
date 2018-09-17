package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong number;

  public HelloWebController() {
    number = new AtomicLong(1);
  }
//  @RequestMapping(value = "/web/greeting", method = RequestMethod.GET)
//  public String greeting(Model model) {
//    model.addAttribute("name", " World");
//    return "greeting";
//  }

//  @GetMapping("/web/greeting")
//  public String greeting(Model model) {
//    model.addAttribute("name", " World");
//    return "greeting";
//  }

  @GetMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("name", " Peter");
    model.addAttribute("number", number.getAndIncrement());
    return "greeting";
  }
}
