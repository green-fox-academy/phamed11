package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Reuse your Sharpie class
//        Create SharpieSet class
//        it contains a list of Sharpie
//                countUsable() -> sharpie is usable if it has ink in it
//        removeTrash() -> removes all unusable sharpies
      Sharpie black = new Sharpie("Black", 44f);
      Sharpie white = new Sharpie("White", 55f);
      Sharpie red = new Sharpie("Red", 333f);
      Sharpie green = new Sharpie("Green", 67f);
      SharpieSet tolltarto = new SharpieSet();
      tolltarto.addSharpies(black);
      tolltarto.printList();

    }
}
