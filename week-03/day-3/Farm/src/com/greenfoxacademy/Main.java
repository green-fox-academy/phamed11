package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {
//        Reuse your Animal class
//        Create a Farm class
//        it has list of Animals
//                it has slots which defines the number of free places for animals
//        breed() -> creates a new animal if there's place for it
//        slaughter() -> removes the least hungry animal
    Animal cow = new Animal("Riska");
    Animal cow2 = new Animal("Joseph");
      System.out.println(cow.hunger);
      cow.eat();
      System.out.println(cow.hunger);
      cow2.hunger = 4;



 }
}
