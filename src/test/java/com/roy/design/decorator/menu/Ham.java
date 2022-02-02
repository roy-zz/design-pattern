package com.roy.design.decorator.menu;

public class Ham extends Topping {
    private static final int COST = 1000;
    private final Sandwich sandwich;

    public Ham(Sandwich sandwich) {
        super(sandwich);
        this.sandwich = sandwich;
        this.sandwich.toppings.add(this);
    }

    @Override
    public int cost() {
        return sandwich.cost() + COST;
    }
}
