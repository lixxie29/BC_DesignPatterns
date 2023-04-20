package org.example;

public class Milk extends CoffeeDecorator{
    public Milk(CoffeeItem coffeeItem) {
        super(coffeeItem);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with milk";
    }
}
