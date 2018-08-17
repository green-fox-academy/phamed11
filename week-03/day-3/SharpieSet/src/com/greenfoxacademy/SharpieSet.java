package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;

public class SharpieSet {
ArrayList<Sharpie> list = new ArrayList<>();

  public SharpieSet() {

  }

  public void addSharpies(Sharpie ceruza) {
    list.add(ceruza);

   }

  public int countUsable() {
    int usable = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).inkAmount > 0) {
        usable++;
      }
    }
    return usable;
  }

  public void removeTrash() {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).inkAmount == 0) {
        list.remove(list.get(i));
      }
    }
  }
  public void printList() {
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).inkAmount + list.get(i).color + list.get(i).width);
    }
  }
}
