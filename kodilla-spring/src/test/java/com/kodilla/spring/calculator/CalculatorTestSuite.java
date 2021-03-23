package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    public void testAdd() {
        //Given
        //Then
        double result = calculator.add(2,2);
        //Then
        assertEquals(4, result);
    }

    @Test
    public void testSub() {
        //Given
        //Then
        double result = calculator.sub(2,2);

        //Then
        assertEquals(0, result);
    }

    @Test
    public void testMul() {
        //Given
        //Then
        double result =  calculator.mul(2,2);
        //Then
        assertEquals(4, result);
    }

    @Test
    public void testDiv() {
        //Given
        //Then
        double result = calculator.div(2,2);
        //Then
        assertEquals(1,result);
    }
}
