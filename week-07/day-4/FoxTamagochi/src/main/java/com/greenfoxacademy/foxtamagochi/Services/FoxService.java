package com.greenfoxacademy.foxtamagochi.Services;

import com.greenfoxacademy.foxtamagochi.Modells.Fox;
import org.springframework.stereotype.Service;

@Service
public interface FoxService {

  void addFox(Fox fox);
}
