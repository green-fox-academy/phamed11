package com.greenfoxacademy.foxtamagochi.Repositories;

import com.greenfoxacademy.foxtamagochi.Modells.Fox;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoxHorde {
  List<Fox> foxes;

  public FoxHorde() {
    foxes = new ArrayList<>();
  }

  public List<Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(List<Fox> foxes) {
    this.foxes = foxes;
  }

  public void addFox(Fox fox) {
    foxes.add(fox);
  }



}
