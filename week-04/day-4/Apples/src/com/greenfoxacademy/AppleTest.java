package com.greenfoxacademy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  @Test
  public void getApple() {
    Apple myObject = new Apple();
    assertEquals("apple", myObject.getApple());
  }
}