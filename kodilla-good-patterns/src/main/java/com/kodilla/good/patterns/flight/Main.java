package com.kodilla.good.patterns.flight;

public class Main {
    public static void main(String args[]) {

        FlightList flightList1 = new FlightList("Warszawa", "Krakow");
        FlightList flightList2 = new FlightList("Krakow", "Rzeszow");
        FlightList flightList3 = new FlightList("Warszawa", "Katowice");
        FlightList flightList4 = new FlightList("Katowice", "Rzeszow");

        Flights flights = new Flights();
        flights.addFrom(flightList1);
        flights.addFrom(flightList2);
        flights.addFrom(flightList3);
        flights.addFrom(flightList4);


        flights.getFrom("Warszawa").forEach(System.out::println);
        flights.getTo("Rzeszow").forEach(System.out::println);

        System.out.println(flights.fromToBy("Warszawa", "Rzeszow", "Katowice"));
    }
}
