package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {

    F16 f16First = new F16();
    F16 f16Second = new F16();
    F35 f35First = new F35();
    F35 f35Second = new F35();
    F35 f35Third = new F35();
    AircraftCarrier roosevelt = new AircraftCarrier(200, 5000);
    AircraftCarrier fuji = new AircraftCarrier(1500, 5000);
    F16 f16Fuji1 = new F16();
    F16 f16Fuji2 = new F16();
    F35 f35Fuji1 = new F35();
    F35 f35Fuji2 = new F35();
    F35 f35Fuji3 = new F35();
    fuji.addAircraft(f16Fuji1);
    fuji.addAircraft(f16Fuji2);
    fuji.addAircraft(f35Fuji1);
    fuji.addAircraft(f35Fuji2);
    fuji.addAircraft(f35Fuji3);
    roosevelt.addAircraft(f16First);
    roosevelt.addAircraft(f16Second);
    roosevelt.addAircraft(f35First);
    roosevelt.addAircraft(f35Second);
    roosevelt.addAircraft(f35Third);

    fuji.fill();
    roosevelt.fill();

    fuji.getStatus();
    roosevelt.getStatus();
    System.out.println();
    System.out.println("first attack \n");
    roosevelt.fight(fuji);
    System.out.println();
    fuji.getStatus();
    System.out.println();
    roosevelt.fill();
    roosevelt.getStatus();
    System.out.println();
    System.out.println("second attack \n");
    roosevelt.fight(fuji);
    System.out.println();
    fuji.getStatus();
    System.out.println();
    roosevelt.fill();
    roosevelt.getStatus();
    System.out.println();
    System.out.println("third attack \n");
    roosevelt.fight(fuji);
    System.out.println();
    fuji.getStatus();
    System.out.println();
    roosevelt.fill();
    roosevelt.getStatus();
    System.out.println();








  }
}
