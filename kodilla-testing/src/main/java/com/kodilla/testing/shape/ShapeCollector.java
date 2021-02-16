package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Triangle;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> geometricFigures = new ArrayList<>();

    public void addFigure(Shape shape) {
        geometricFigures.add(shape);

    }

    public int getFiguresQuantity() {
        return geometricFigures.size();
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(geometricFigures.contains(shape)) {
            geometricFigures.remove(shape);
            result = true;
        }
        return true;

    }

    public Shape getFigure(int i) {
        Shape shape = null;
        if(i >= 0 && i < geometricFigures.size() ) {
            shape = geometricFigures.get(i);
        }
        return shape;

    }

    public String showFigures() {
        String result = null;
        Shape circle = new Circle(5);
        result = circle.getShapeName("Circle");
        {

            return result;
        }
    }
}




