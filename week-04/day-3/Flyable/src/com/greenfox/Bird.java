package com.greenfox;

import com.greenfoxacademy.*;

public class Bird extends Animal implements Flyable {
  boolean fly;

  public Bird(String name) {
    super(name);
  }

  @Override
  public String breed() {
    String breedi = "laying eggs.";
    return breedi;
  }

  @Override
  public String land() {
    return "Lands on feet";
  }

  @Override
  public String fly() {
    return "flies high";
  }

  @Override
  public String takeoff() {
    return "takes of fast";
  }
}
