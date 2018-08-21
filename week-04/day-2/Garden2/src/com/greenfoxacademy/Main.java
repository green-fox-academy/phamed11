package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {
    Flower yellow = new Flower("yellow");
    Flower blue = new Flower("blue");
    Tree purple = new Tree("purple");
    Tree orange = new Tree("orange");
    Garden paradise = new Garden();
    paradise.garden.add(yellow);
    paradise.garden.add(blue);
    paradise.garden.add(purple);
    paradise.garden.add(orange);

    paradise.statusOfTheGarden();
    System.out.println();
    paradise.watering(40);








  }
}
