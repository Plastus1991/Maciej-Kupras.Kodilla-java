package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {

        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);


        }
        return resultMap;

    }

    public double average() {
        double sum = 0;
        double averageTemp = 0;
        for (Map.Entry<String, Double> average : temperatures.getTemperatures().entrySet()) {
            sum = sum + average.getValue();

        }
        averageTemp = sum / temperatures.getTemperatures().size();

        return averageTemp;

    }

    public double median() {
        double median = 0;

        Collection<Double> values = temperatures.getTemperatures().values();
        ArrayList<Double> temp = new ArrayList<>(values);

           Collections.sort(temp);
           if (temp.size() % 2 == 0) {
               median = (temp.get((temp.size() - 2) / 2) + temp.get(temp.size() / 2)) / 2;
           } else {
               median = temp.get((temp.size() - 1) / 2);
            }


        return median;
        }

    }