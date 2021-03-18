package com.kodilla.good.patterns.flight;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        AirPort flightList1 = new AirPort( "Katowice");
        AirPort flightList2 = new AirPort( "Rzeszow");
        AirPort flightList3 = new AirPort( "Katowice");
        AirPort flightList4 = new AirPort( "Krakow");

        ArrayList<AirPort> FlightList1 = new ArrayList<>();
        FlightList1.add(flightList1);
        FlightList1.add(flightList2);
        FlightList1.add(flightList3);
        FlightList1.add(flightList4);

        Flights flights = new Flights();
        flights.addToMap("Warszawa", FlightList1);

        AirPort flights5 = new AirPort("Warszawa");
        AirPort flights6 = new AirPort("Rzeszow");
        AirPort flights7 = new AirPort("Szczecin");
        AirPort flights8 = new AirPort("Lodz");

        ArrayList<AirPort> FlightList2 = new ArrayList<>();
        FlightList2.add(flights5);
        FlightList2.add(flights6);
        FlightList2.add(flights7);
        FlightList2.add(flights8);

        flights.addToMap("Krakow",FlightList2 );

        System.out.println( flights.getFrom("Krakow"));

        System.out.println( flights.getTo(new AirPort("Rzeszow")));

        System.out.println(flights.getToBy("Warszawa", new AirPort("Krakow"), new AirPort("Rzeszow")));
    }
}
