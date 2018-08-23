package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  public ArrayList<String> countLetters(String test) {
    Map<String, Integer> dictionary = new HashMap<>();
    ArrayList<String> splitted = new ArrayList<>(Arrays.asList(test.split("")));
    ArrayList<String> unique = new ArrayList<>();
    int value = 0;
    for (int i = 0; i < splitted.size(); i++) {
      if (!unique.contains(splitted.get(i))) {
        unique.add(splitted.get(i));
      }
    }
    return unique;
  }
}

