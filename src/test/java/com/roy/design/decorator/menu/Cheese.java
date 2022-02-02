package com.roy.design.decorator.menu;

public class Cheese extends Topping {
    private static final int COST = 500;
    private final Sandwich sandwich;

    public Cheese(Sandwich sandwich) {
        super(sandwich);
        this.sandwich = sandwich;
        this.sandwich.toppings.add(this);
    }

    @Override
    public int cost() {
        return sandwich.cost() + COST;
    }

}
