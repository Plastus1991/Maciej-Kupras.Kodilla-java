package com.kodilla.stream.world;

import java.math.BigDecimal;


public final class Country {

    private final String CountryName;
    private final String peopleQuantity;


    public Country(final String countryName, final String peopleQuantity) {
        this.CountryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal quantity = new BigDecimal(peopleQuantity);
        return quantity;
    }

}
