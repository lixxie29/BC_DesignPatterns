package org.example;

import static java.lang.Math.floor;

public class Coffee_Main {
    public static void main(String[] args)
    {
        CoffeeItem espresso = new Espresso();
        System.out.println("Cost: " + espresso.getCost() + "; Description: " + espresso.getDescription());

        CoffeeItem latte = new Latte();
        latte = new Milk(latte);
        System.out.println("Cost: " + latte.getCost() + "; Description: " + latte.getDescription());

        CoffeeItem latte_s_m = new Latte();
        latte_s_m = new Sugar(latte_s_m);
        latte_s_m = new Milk(latte_s_m);
        System.out.println("Cost: " + latte_s_m.getCost() + ", Description: " + latte_s_m.getDescription());

        CoffeeItem capp_m_s = new Cappuccino();
        capp_m_s = new Milk(capp_m_s);
        capp_m_s = new Sugar(capp_m_s);
        System.out.println("Cost: " + capp_m_s.getCost() + ", Description: " + capp_m_s.getDescription());

        CoffeeItem brew = new ColdBrew();
        brew = new Sugar(brew);
        System.out.println("Cost: " + brew.getCost() + "; Description: " + brew.getDescription());
        System.out.println();
        System.out.println();


        CoffeeMenu menu = new CoffeeMenu();
        menu.addItem(espresso);
        menu.addItem(latte_s_m);
        menu.addItem(latte);
        menu.addItem(capp_m_s);
        menu.addItem(brew);
        System.out.println("Cost: " + floor(menu.getCost()) + "; Description: " + menu.getDescription());
    }
}
