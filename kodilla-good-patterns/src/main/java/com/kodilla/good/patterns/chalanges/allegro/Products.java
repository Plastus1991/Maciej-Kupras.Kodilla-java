package com.kodilla.good.patterns.chalanges.allegro;

import java.util.ArrayList;

public class Products {

    private ArrayList<Product> electronics;
    private ArrayList<Product> healthAndButy;

    @Override
    public String toString() {
        return "Products{" +
                "electronics=" + electronics +
                ", healthAndButy=" + healthAndButy +
                '}';
    }

    public Products(ArrayList<Product> electronics, ArrayList<Product> healthAndButy) {
        this.electronics = electronics;
        this.healthAndButy = healthAndButy;
    }

    public ArrayList<Product> getElectronics() {
        return electronics;
    }

    public ArrayList<Product> getHealthAndButy() {
        return healthAndButy;
    }
}
















