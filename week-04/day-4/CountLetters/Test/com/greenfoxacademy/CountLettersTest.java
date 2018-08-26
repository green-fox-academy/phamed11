package com.greenfoxacademy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

  @Test
  public void countLetters() {
    CountLetters testMap = new CountLetters();
    testMap.countLetters("mama");
    assertTrue(testMap.countLetters("mama") != null);
  }
}