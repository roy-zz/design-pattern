package com.roy.design.decorator.menu;

public class Tuna extends Topping {
    private static final int COST = 3000;
    private final Sandwich sandwich;

    public Tuna(Sandwich sandwich) {
        super(sandwich);
        this.sandwich = sandwich;
        this.sandwich.toppings.add(this);
    }

    @Override
    public int cost() {
        return sandwich.cost() + COST;
    }

}
