package com.greenfoxacademy.jsonexercises.models;

public class User {

  String welcome_message;

  public User() {
  }

  public User(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
