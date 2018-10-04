package com.greenfoxacademy.p2pchat.controllers;

import com.greenfoxacademy.p2pchat.models.LogList;
import com.greenfoxacademy.p2pchat.services.MainServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LogRestController {

  private MainServices mainServices;

  @Autowired
  public LogRestController(MainServices mainServices) {
    this.mainServices = mainServices;
  }

  @GetMapping("/log")
  public LogList logList() {
    return mainServices.logList();
  }
}
