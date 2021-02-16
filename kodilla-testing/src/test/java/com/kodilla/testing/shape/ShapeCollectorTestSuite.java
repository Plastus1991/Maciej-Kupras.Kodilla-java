package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Circle;
import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    @Test
    void testAddFigure() {
        //Given
        Shape circle = new Circle( 5);
        ShapeCollector add = new ShapeCollector();

        // When
        add.addFigure(circle);

        //Then
        Assertions.assertEquals(1, add.getFiguresQuantity());

    }

    @Test
    void testRemoveFigure() {
        //Give
        Shape circle = new Circle( 6);
        ShapeCollector shape = new ShapeCollector();
        shape.addFigure(circle);

        //When
        boolean result = shape.removeFigure(circle);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shape.getFiguresQuantity());
    }

    @Test
    void getFigure() {
        //Give
        Shape circle = new Circle( 7);
        ShapeCollector shape = new ShapeCollector();
        shape.addFigure(circle);

        //When
        Shape retrievedShape;
        retrievedShape = shape.getFigure(0);

        //Then
        Assertions.assertEquals(circle, retrievedShape);

    }

    @Test
    void showFigures() {
        //Give
        Shape circle = new Circle(6);
        String name = circle.getShapeName("Circle");
        ShapeCollector shape = new ShapeCollector();

        //When
        String show = shape.showFigures();

       //Then
        Assertions.assertEquals(name, show);

    }

    @Test
    void circleField() {
        //Give
        Shape circle = new Circle(8);

        //When
        double field = circle.getField();
        double result = Math.PI * 8 * 8;

        //Then
        Assertions.assertEquals(result, field);
    }

    @Test
    void squareField() {
        //Give
        Shape square = new Square(5);

        //When
       double field = square.getField();
       double result = 5*5;

       //Then
        Assertions.assertEquals(result, field);

    }

    @Test
    void triangleField() {
        //Give
        Shape triangle = new Triangle(4,2);

        //When
        double field = triangle.getField();
        double result = (4*2)/2;

        //Then
        Assertions.assertEquals(result, field);
    }
}
