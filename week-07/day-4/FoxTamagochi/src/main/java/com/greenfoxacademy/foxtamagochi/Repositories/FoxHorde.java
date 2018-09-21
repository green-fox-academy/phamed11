package com.greenfoxacademy.foxtamagochi.Repositories;

import com.greenfoxacademy.foxtamagochi.Modells.Fox;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
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
    foxes.add(new Fox("Makaroka"));

  }

  public FoxHorde(List<Fox> foxes) {
    this.foxes = foxes;
  }

  public void addFox(Fox fox) {
    foxes.add(fox);
  }

  public Fox getFoxByName(String name) {
    int index = 0;
    for (int i = 0; i < foxes.size(); i++) {
      if (foxes.get(i).getName().equals(name)) {
        index = i;
      }
    }
    return foxes.get(index);
  }
}
