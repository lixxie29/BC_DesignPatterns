package org.example;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMenu implements CoffeeItem{
    private List<CoffeeItem> items;

    public CoffeeMenu() {
        this.items = new ArrayList<>();
    }

    public void addItem(CoffeeItem item)
    {
        this.items.add(item);
    }

    public void removeItem(CoffeeItem item)
    {
        this.items.remove(item);
    }

    @Override
    public double getCost() {
        double cost = 0.0;
        for (CoffeeItem item: items)
        {
            cost += item.getCost();
        }
        return cost;
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder();
        for (CoffeeItem item:items)
        {
            description.append(item.getDescription());
            description.append(", ");
        }
        return description.toString();
    }
}
