package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testPizzaWithSausage() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new Bacon(pizza);

        //When
        BigDecimal price = pizza.getCost();
        String description = pizza.getDescription();

        //Then
        assertEquals(new BigDecimal(19), price);
        assertEquals("Basic pizza -potato sauce + cheese + bacon", description);

    }

    @Test
    void testPizzaWithAllToppings() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new Bacon(pizza);
        pizza = new DoubleCheese(pizza);
        pizza = new Sausage(pizza);

        //Then
        BigDecimal price = pizza.getCost();
        String description = pizza.getDescription();

        //Then
        assertEquals(new BigDecimal(26), price);
        assertEquals("Basic pizza -potato sauce + cheese + bacon + double cheese + sausage", description);
    }
}
