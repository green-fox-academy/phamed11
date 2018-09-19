package com.greenfoxacademy.hellobeanworld.Services;

import org.springframework.stereotype.Service;

@Service
public class MyColorImpl_BlackColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is black in Color");

  }
}
