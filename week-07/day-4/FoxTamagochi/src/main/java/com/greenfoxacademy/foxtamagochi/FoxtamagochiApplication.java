package com.greenfoxacademy.foxtamagochi;

import com.greenfoxacademy.foxtamagochi.Modells.Fox;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoxtamagochiApplication {

  public static void main(String[] args) {
    SpringApplication.run(FoxtamagochiApplication.class, args);

    Fox karak = new Fox("Karak");

  }
}
