package org.example;

public class ColdBrew implements CoffeeItem{
    @Override
    public double getCost() {
        return 5.35;
    }

    @Override
    public String getDescription() {
        return "Cold Brew";
    }
}
