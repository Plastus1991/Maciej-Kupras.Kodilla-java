package com.kodilla.good.patterns.food2door;

public class AddCompanies {

    public void addCompanies() {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        Companies companies = new Companies();
        companies.addCompany(extraFoodShop);
        companies.addCompany(healthyShop);
        companies.addCompany(glutenFreeShop);



    }
}
