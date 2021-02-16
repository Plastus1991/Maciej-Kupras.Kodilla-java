package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] tab = new int[20];
        for(int i=0; i< tab.length; i++) {
            tab[i] =i;
        }

        //Then
        double result = 9.5;

        //Then
        Assertions.assertEquals(9.5, ArrayOperations.getAverage(tab));

    }
}
