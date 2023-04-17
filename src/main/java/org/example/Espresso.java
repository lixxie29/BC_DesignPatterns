package org.example;

public class Espresso implements CoffeeItem{
    @Override
    public double getCost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
