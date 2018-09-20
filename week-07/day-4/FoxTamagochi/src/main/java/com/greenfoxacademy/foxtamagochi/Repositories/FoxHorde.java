package com.greenfoxacademy.foxtamagochi.Repositories;

import com.greenfoxacademy.foxtamagochi.Modells.Fox;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;
import java.util.List;


public class FoxHorde {
  List<Fox> foxes;

  public List<Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(List<Fox> foxes) {
    this.foxes = foxes;
  }

  public FoxHorde() {
    foxes = new ArrayList<>();
    foxes.add(new Fox("Karak"));
    foxes.add(new Fox("Vuk"));
    foxes.add(new Fox("Smarty"));
  }

  public FoxHorde(List<Fox> foxes) {
    this.foxes = foxes;
  }

  public void addFox(Fox fox) {
    foxes.add(fox);
  }

  public Fox getFoxByName(String name) {
    Fox result = new Fox();
    for(Fox fox : getFoxes()) {
      if (fox.getName().equals(name)) {
        result = fox;
      }
    }
    return result;
  }

}
