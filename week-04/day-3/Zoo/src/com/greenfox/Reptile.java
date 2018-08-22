package com.greenfox;

public class Reptile extends Animal {


  public Reptile(String name) {
    super(name);
  }

  @Override
  public String breed() {
    String breedi = "laying eggs.";
    return breedi;
  }
}
