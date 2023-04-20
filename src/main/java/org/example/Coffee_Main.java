package org.example;

public class Coffee_Main {
    public static void main(String[] args)
    {
        CoffeeItem espresso = new Espresso();
        System.out.println("Cost--> " + espresso.getCost() + "; Description--> " + espresso.getDescription());
    }
}
