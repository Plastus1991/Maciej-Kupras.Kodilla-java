package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .ingredient("lettuce")
                .sauce("barbecue")
                .burgers(3)
                .ingredient("prawn")
                .bun("bum with sesame seeds")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(2, howManyIngredients);

    }
}
