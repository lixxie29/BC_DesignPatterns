package org.example;

public class Cappuccino implements CoffeeItem{

    @Override
    public double getCost() {
        return 3.49;
    }

    @Override
    public String getDescription() {
        return "Cappuccino";
    }
}
