package com.greenfoxacademy.foxtamagochi.Repositories;

import com.greenfoxacademy.foxtamagochi.Modells.Fox;

import java.util.List;

public class FoxHorde {
  List<Fox> foxes;

  public List<Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(List<Fox> foxes) {
    this.foxes = foxes;
  }

  public FoxHorde(List<Fox> foxes) {
    this.foxes = foxes;
  }


}
