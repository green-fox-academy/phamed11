package com.greenfoxacademy.hellobeanworld.Services;

import org.springframework.stereotype.Service;

@Service
public class MyColorImpl_RedColor implements MyColor {

  @Override
  public String printColor() {
    return "It is red in Color";
  }
}
