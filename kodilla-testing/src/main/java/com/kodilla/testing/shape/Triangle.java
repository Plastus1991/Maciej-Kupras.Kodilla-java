package com.kodilla.testing.shape;

public class Triangle implements Shape {

    double  a;
    double  h;

    public Triangle(int a, int h  ) {
        this.a = a;
        this.h = h;

    }

    @Override
    public String getShapeName(String name) {
        return name;

    }

    @Override
    public double getField() {
        return (a*h)/2;

    }
}
