package com.greenfox;

public class Mammal extends Animal {


  public Mammal(String name) {
    super("Dog");
  }

  @Override
  public String breed() {
    String breedi = "pushing miniature versions out ";
    return breedi;
  }
}
