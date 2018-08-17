package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {
//        Create Station and Car classes
////            Station
////        gasAmount
////        refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
////        Car
////            gasAmount
////        capacity
////        create constructor for Car where:
////        initialize gasAmount -> 0
////        initialize capacity -> 100
      Car lada = new Car();
      Station shell = new Station();

      System.out.println(lada.capacity);
      System.out.println(lada.gasAmount);
      System.out.println(shell.gasAmount);
      shell.reFill(lada);
      shell.reFill(lada);
      System.out.println("after refill lada capacity: " + lada.capacity);
      System.out.println("after refill lada gasamount: " + lada.gasAmount);
      System.out.println("affer refill shell gasamount: " + shell.gasAmount);
    }
}
