package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {
    // Garden with flowers and trees created

    Garden beauty = new Garden();
    Flowers yellow = new Flowers("yellow");
    Flowers blue = new Flowers("blue");
    Trees purple = new Trees("purple");
    Trees orange = new Trees("orange");
    beauty.myGardenTrees.add(purple);
    beauty.myGardenTrees.add(orange);
    beauty.myGardenFlowers.add(yellow);
    beauty.myGardenFlowers.add(blue);
    GardeningApp gardenningApp = new GardeningApp();

    // program start
    gardenningApp.start(beauty);

  }
}
