package com.greenfoxacademy.hellobeanworld.Services;

import org.springframework.stereotype.Service;

public class MyColorImpl_GreenColor implements MyColor{
  @Override
  public String printColor() {
    return "It is green in Color";

  }
}
