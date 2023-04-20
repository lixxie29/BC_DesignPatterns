package org.example;

public class Sugar extends CoffeeDecorator{
    public Sugar(CoffeeItem coffeeItem) {
        super(coffeeItem);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with added sugar";
    }
}
