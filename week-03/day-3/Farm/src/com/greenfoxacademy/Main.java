package com.greenfoxacademy;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
//        Reuse your Animal class
//        Create a Farm class
//        it has list of Animals
//                it has slots which defines the number of free places for animals
//        breed() -> creates a new animal if there's place for it
//        slaughter() -> removes the least hungry animal

    Farm myFarm = new Farm(10);
    Animal cow = new Animal("tehen");
    Animal sheep = new Animal("barany");
    Animal chicken = new Animal("csirke");
    cow.eat();
    chicken.play();
    sheep.eat();
    sheep.eat();
    cow.eat();
    myFarm.list.add(sheep);
    myFarm.list.add(chicken);
    myFarm.list.add(cow);

    System.out.println();

    myFarm.breed(cow, "tehen2");
    myFarm.breed(cow, "tehen3");
    myFarm.breed(cow, "tehen4");
    myFarm.breed(sheep, "barany2");
    myFarm.list.get(0).eat();
    myFarm.list.get(3).eat();
    myFarm.list.get(3).eat();
    myFarm.list.get(1).eat();
    myFarm.list.get(4).eat();




    for (int i = 0; i < myFarm.list.size() ; i++) {
      System.out.println("The " + myFarm.list.get(i).name + "'s hunger level is: " + myFarm.list.get(i).hunger);
    }
    System.out.println("This farm has : " + myFarm.list.size() + " animals");
    myFarm.slaughter();

    System.out.println();
    System.out.println("This farm has : " + myFarm.list.size() + " animals");
  }
}
