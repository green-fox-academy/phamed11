package com.greenfoxacademy.hellobeanworld.Controllers;

import com.greenfoxacademy.hellobeanworld.Services.UtilityService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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
    model.addAttribute("color", color);
    return "colored";
  }

  @GetMapping("/useful/colored")
  public String randomColorBackground(Model model) {
  model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String email(@RequestParam(value = "email") String emailAddress, Model model) {
    model.addAttribute("email", utilityService.validateEmail(emailAddress));
    return "email";
  }

  @GetMapping("useful/{text}/{number}")
  public String ceasarCode(@PathVariable(value = "text") String text, @PathVariable(value = "number") int number, Model model) {
    model.addAttribute("code", utilityService.caesar(text,number));
    return "ceasar_encode";
  }

  @GetMapping("useful/decode/{text}/{number}")
  public String ceasarCodeDecode(@PathVariable(value = "text") String text, @PathVariable(value = "number") int number, Model model) {
    model.addAttribute("code", utilityService.caesar(text,- number));
    return "ceasar_decode";
  }
}
