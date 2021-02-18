package com.kodilla.exception.test;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.HashMap;

public class FinderFilght {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> airportFind = new HashMap<>();
        airportFind.put("Airport1", true);
        airportFind.put("Airport2", false);
        airportFind.put("Airport3", true);
        airportFind.put("Airport4", false);

       if ( airportFind.containsKey(flight.getDepartureAirport()) && airportFind.containsKey(flight.getArrivalAirport())) {
           System.out.println("ok");
        }   else {
           throw new RouteNotFoundException();
       }

    }
}

class main {
    public static void main(String args[]) {

        Flight flight = new Flight ("Airport5","Airport1" );
        FinderFilght finderFilght = new FinderFilght();

       try {
           finderFilght.findFlight(flight);
       } catch (RouteNotFoundException e) {
           System.out.println("Airport does not exist");
       }

    }
}
