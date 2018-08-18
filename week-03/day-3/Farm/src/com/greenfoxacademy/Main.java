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

    Farm myFarm = new Farm(6);
    Animal cow = new Animal("Marci the cow");
    Animal sheep = new Animal("Gyuri the sheep");
    Animal chicken = new Animal("Etel the chicken");
    cow.eat();
    chicken.play();
    sheep.eat();
    sheep.eat();
    cow.eat();
    myFarm.list.add(sheep);
    myFarm.list.add(chicken);
    myFarm.list.add(cow);
    System.out.println();
    myFarm.breed(cow, "Joe the cow");
    myFarm.breed(cow, "Imre the cow");
    myFarm.breed(chicken, "Koko the chicken");
    myFarm.breed(sheep, "Bee the sheep");
    myFarm.list.get(0).eat();
    myFarm.list.get(3).eat();
    myFarm.list.get(3).eat();
    myFarm.list.get(1).eat();
    myFarm.list.get(4).eat();

    myFarm.breed(chicken, "Janos the chicken");

    myFarm.hungerLevels();
    myFarm.numberOfAnimals();
    myFarm.slaughter();
    myFarm.numberOfAnimals();
    myFarm.slaughter();

    myFarm.breed(sheep, "Otto a birka");
    myFarm.breed(cow, "jjj");
    myFarm.breed(chicken, "dsf");








  }
}
