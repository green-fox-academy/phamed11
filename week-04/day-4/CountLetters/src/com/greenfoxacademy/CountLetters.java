package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  public HashMap<Character, Integer> countLetters(String test) {
    HashMap<Character, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < test.length(); i++) {
      Character character = test.charAt(i);
      if (!dictionary.containsKey(character)) {
        dictionary.put(character, 1);
      } else {
        dictionary.put(character, dictionary.get(character) + 1);
      }
    }
    return dictionary;
  }
}


