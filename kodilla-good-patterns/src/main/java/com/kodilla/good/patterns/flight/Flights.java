package com.kodilla.good.patterns.flight;


import java.util.*;
import java.util.stream.Collectors;

public class Flights {

    private Map<String, ArrayList> flightMap = new HashMap<>();

    public void addToMap(String nameAirPort, ArrayList<AirPort> airPorts) {
        flightMap.put(nameAirPort, airPorts);

    }

    public List<ArrayList> getFrom(String from) {

        return flightMap.entrySet().stream()
                .filter(e -> e.getKey().equals(from))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    public List<String> getTo(AirPort to) {

        return flightMap.entrySet().stream()
                .filter(e -> e.getValue().contains(to))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public List<String> getToBy(String from, AirPort by, AirPort to) {

        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, ArrayList> entry : flightMap.entrySet()) {
            if (entry.getValue().contains(to)) {
                list.add(entry.getKey());

            }


        }
        return list;
    }
}













