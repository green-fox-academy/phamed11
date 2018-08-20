package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {
    Flowers yellow = new Flowers("yellow");
    Flowers blue = new Flowers("blue");
    Trees purple = new Trees("purple");
    Trees orange = new Trees("orange");

    Garden beauty = new Garden();

    beauty.myGardenTrees.add(purple);
    beauty.myGardenTrees.add(orange);
    beauty.myGardenFlowers.add(yellow);
    beauty.myGardenFlowers.add(blue);

    beauty.status();
    System.out.println();
    beauty.watering(40);
    System.out.println();
    beauty.watering(70);
  }
}
