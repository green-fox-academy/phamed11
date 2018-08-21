package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {

        F16 f16 = new F16();
        F35 f35 = new F35();
        AircraftCarrier roosevelt = new AircraftCarrier(500, 500);
        roosevelt.addAircraft(f16);
        roosevelt.addAircraft(f35);

        roosevelt.listOfAircraftsOnCarrier();


    }
}
