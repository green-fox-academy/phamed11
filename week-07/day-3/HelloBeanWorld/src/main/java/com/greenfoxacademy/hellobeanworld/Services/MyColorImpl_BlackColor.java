package com.greenfoxacademy.hellobeanworld.Services;

import org.springframework.stereotype.Service;


public class MyColorImpl_BlackColor implements MyColor {
  @Override
  public String printColor() {
    return "It is black in Color";

  }
}
