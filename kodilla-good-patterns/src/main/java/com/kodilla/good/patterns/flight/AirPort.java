package com.kodilla.good.patterns.flight;

import java.util.Objects;

public class AirPort {


    private String flightTo;

    public AirPort( String flightTo) {

        this.flightTo = flightTo;
    }

    public String getFlightTo() {
        return flightTo;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightTo='" + flightTo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof AirPort))
            return false;
        AirPort flight = (AirPort) o;
        return Objects.equals(getFlightTo(), flight.getFlightTo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlightTo());
    }
}

