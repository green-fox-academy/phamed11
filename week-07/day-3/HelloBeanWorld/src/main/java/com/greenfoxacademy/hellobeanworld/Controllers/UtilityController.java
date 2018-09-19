package com.greenfoxacademy.hellobeanworld.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {

  @GetMapping("/useful")
  public String allAvailableUtilities() {
    

    return "useful";
  }

}
