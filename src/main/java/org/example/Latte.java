package org.example;

public class Latte implements CoffeeItem{
    @Override
    public double getCost() {
        return 2.99;
    }

    @Override
    public String getDescription() {
        return "Latte";
    }
}
