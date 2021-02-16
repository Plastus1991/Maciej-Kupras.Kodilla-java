package com.kodilla.testing.shape;

public class Circle implements Shape {

    private int a;

    public Circle( int a) {

        this.a = a;
    }


    @Override
    public String getShapeName(String name) {
        return name;

    }

    @Override
    public double getField() {
        return Math.PI * a * a;

    }


}
