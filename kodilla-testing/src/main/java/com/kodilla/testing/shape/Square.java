package com.kodilla.testing.shape;

public class Square implements Shape {

    private int a;

    public Square( int a) {

        this.a = a;

    }

    @Override
    public String getShapeName(String name) {
        return name;

    }

    @Override
    public double getField () {

        return a * a;
    }
}
