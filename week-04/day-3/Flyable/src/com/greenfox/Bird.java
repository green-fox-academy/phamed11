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
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeoff() {

  }
}
