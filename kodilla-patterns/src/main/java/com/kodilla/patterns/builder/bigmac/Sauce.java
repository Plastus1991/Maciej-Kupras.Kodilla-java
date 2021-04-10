package com.kodilla.patterns.builder.bigmac;

public enum Sauce {

    GARLIC("Garlic sauce"),
    HOT("Hot sauce"),
    MIX("Mix sauce");

    private String typeSauce;

    Sauce(String typeSauce) {
        this.typeSauce = typeSauce;
    }

    public String getTypeSauce() {
        return typeSauce;
    }
}
