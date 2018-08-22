package com.greenfox;

public class Bird extends Animal {
  boolean fly;

  public Bird(String name) {
    super(name);
  }

  @Override
  public String breed() {
    String breedi = "laying eggs.";
    return breedi;
  }
}
