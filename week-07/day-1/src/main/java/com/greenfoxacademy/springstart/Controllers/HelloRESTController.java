package com.greenfoxacademy.springstart.Controllers;


import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {


//  @GetMapping("/greeting")
//  public Greeting greeting(@RequestParam(value = "name", required = true) String name) {
//    AtomicLong number = new AtomicLong(1);
//    Greeting greeting = new Greeting(number, "Hello " + name);
//    return greeting;
//  }

  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", required = true) String name) {
    Greeting greeting = new Greeting("Hello " + name);
    return greeting;
  }
}
