package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        //Given
        Country country1 = new Country("Country1", "100000000000");
        Country country2 = new Country("Country2", "222222222222");
        Country country3 = new Country("Country3", "111111111111");

        Continent Asia = new Continent();
        Continent Europe = new Continent();
        Asia.addCountry(country1);
        Asia.addCountry(country2);
        Europe.addCountry(country3);

        List<Continent> continents = new ArrayList<>();
        continents.add(Asia);
        continents.add(Europe);

        //When
        BigDecimal AllPeople = continents.stream()
                .flatMap(people -> people.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedSand = new BigDecimal("433333333333");
        assertEquals(expectedSand, AllPeople);

    }

}
