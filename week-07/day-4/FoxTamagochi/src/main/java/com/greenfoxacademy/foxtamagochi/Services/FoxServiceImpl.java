package com.greenfoxacademy.foxtamagochi.Services;


import com.greenfoxacademy.foxtamagochi.Modells.Fox;
import com.greenfoxacademy.foxtamagochi.Repositories.FoxHorde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxServiceImpl implements FoxService {
  FoxHorde foxHorde;

  @Autowired
  public FoxServiceImpl(FoxHorde foxHorde) {
    this.foxHorde = foxHorde;
  }

  @Override
  public Fox loginFox(String name) {
    Integer index = null;
    for (int i = 0; i < foxHorde.getFoxes().size(); i++) {
      if (name.equals(foxHorde.getFoxes().get(i).getName())) {
        index = i;
      }
    }
    if (index == null) {
      return createFoxaddToFoxHorde(name);
    }
    return foxHorde.getFoxes().get(index);
  }


  public Fox createFoxaddToFoxHorde(String name) {
    Fox fox = new Fox(name);
    foxHorde.getFoxes().add(fox);
    return fox;
  }

}
