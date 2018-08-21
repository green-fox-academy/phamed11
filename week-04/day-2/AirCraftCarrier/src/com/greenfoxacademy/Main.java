package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {

    F16 f16First = new F16();
    F16 f16Second = new F16();
    F35 f35First = new F35();
    F35 f35Second = new F35();
    F35 f35Third = new F35();
    AircraftCarrier roosevelt = new AircraftCarrier(1200, 5000);
    AircraftCarrier fuji = new AircraftCarrier(1500, 5000);
    roosevelt.addAircraft(f16First);
    roosevelt.addAircraft(f16Second);
    roosevelt.addAircraft(f35First);
    roosevelt.addAircraft(f35Second);
    roosevelt.addAircraft(f35Third);
    roosevelt.fill();

    roosevelt.fight(fuji);
    roosevelt.getStatus();







  }
}
