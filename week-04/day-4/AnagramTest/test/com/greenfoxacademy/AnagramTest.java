package com.greenfoxacademy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void testIfAnagram() {
    String one = "dog";
    String two = "god";
    Anagram test = new Anagram();
    assertTrue(test.anagram(one, two));


  }

}