package com.greenfoxacademy;

public class Plants {
String color;
Boolean thirsty = true;
double thirstLevel;
int thirstyIfsmaller = 0;

  public Plants(String color, int thirstyIfsmaller){
    this.color = color;
    this.thirstyIfsmaller = thirstyIfsmaller;

  }

  public boolean thirstyOrNot() {
    if (this.thirstLevel < thirstyIfsmaller) {
      thirsty = true;
    } else {
      thirsty = false;
    }
    return thirsty;
  }






}
