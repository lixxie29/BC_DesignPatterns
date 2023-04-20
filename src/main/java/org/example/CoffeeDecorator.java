package org.example;

public abstract class CoffeeDecorator implements CoffeeItem {
    protected CoffeeItem coffeeItem;

    public CoffeeDecorator(CoffeeItem coffeeItem)
    {
        this.coffeeItem = coffeeItem;
    }

    @Override
    public double getCost() {
        return coffeeItem.getCost();
    }

    @Override
    public String getDescription() {
        return coffeeItem.getDescription();
    }
}
