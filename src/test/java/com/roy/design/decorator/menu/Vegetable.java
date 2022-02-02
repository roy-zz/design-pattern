package com.roy.design.decorator.menu;

public class Vegetable extends Topping {
    private static final int COST = 1000;
    private final Sandwich sandwich;

    public Vegetable(Sandwich sandwich) {
        super(sandwich);
        this.sandwich = sandwich;
        this.sandwich.toppings.add(this);
    }

    @Override
    public int cost() {
        return sandwich.cost() + COST;
    }

}
