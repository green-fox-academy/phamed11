package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {

    F16 f16 = new F16();
    F35 f35 = new F35();
    AircraftCarrier roosevelt = new AircraftCarrier(444, 500);
    roosevelt.addAircraft(f16);
    roosevelt.addAircraft(f35);

    roosevelt.listOfAircraftsOnCarrier();
    System.out.println();

    roosevelt.fill();
    System.out.println();
    roosevelt.listOfAircraftsOnCarrier();

    System.out.println(roosevelt.ammoStorageSize);


  }
}
