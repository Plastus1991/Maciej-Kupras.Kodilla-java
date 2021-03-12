package com.kodilla.good.patterns.flight;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Flights {

    private ArrayList<FlightList> FligtsList = new ArrayList<>();


    public void addFrom(FlightList flightList) {
        FligtsList.add(flightList);
    }


    public List<FlightList> getFrom(String fromCity) {
        return FligtsList.stream()
                .filter(e -> e.getFlightFrom().equals(fromCity))
                .collect(Collectors.toList());
    }

    public List<FlightList> getTo(String toCity) {
        return FligtsList.stream()
                .filter(e -> e.getFlightTo().equals(toCity))
                .collect(Collectors.toList());

    }

    public List<String> fromToBy(String from, String to, String by) {

        List<FlightList> fromList = FligtsList.stream()
                .filter(e -> e.getFlightFrom().equals(from) && e.getFlightTo().equals(by))
                .collect(Collectors.toList());

        List<FlightList> toList = FligtsList.stream()
                .filter(e -> e.getFlightFrom().equals(by) && e.getFlightTo().equals(to))
                .collect(Collectors.toList());

        List<String> FligthList = new ArrayList<>();
        for (FlightList f1 : fromList) {
            for (FlightList f2 : toList) {
                FligthList.add(f1.toString() + "--" + f2.toString());
            }
        }
        return FligthList;
    }
}






