package com.greenfoxacademy.hellobeanworld.Controllers;

import com.greenfoxacademy.hellobeanworld.Services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UtilityController {

  UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }


  @GetMapping("/useful")
  public String allAvailableUtilities(Model model) {
    model.addAttribute("colors", utilityService.getColors());
    return "useful";
  }

  @GetMapping("/useful/{color}")
  public String allAvailableUtilities(Model model, @PathVariable(value = "color") String color) {
    model.addAttribute("setcolor", color);
    return "colored";
  }

  @GetMapping("/useful/colored")
  public String randomColorBackground(Model model) {
  model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }
}
