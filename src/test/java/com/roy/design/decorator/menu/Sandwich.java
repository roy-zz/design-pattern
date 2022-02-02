package com.roy.design.decorator.menu;

import java.util.ArrayList;
import java.util.List;

public abstract class Sandwich {
    private final String name;
    protected List<Topping> toppings = new ArrayList<>();

    public Sandwich(String name) {
        this.name = name;
    }

    public Sandwich(Sandwich sandwich) {
        this.name = sandwich.getName();
        this.toppings = sandwich.getToppings();
    }

    public abstract int cost();

    public String getName() {
        return name;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public StringBuilder getToppingNames() {
        StringBuilder toppingNames = new StringBuilder();
        toppings.forEach(i -> toppingNames.append(String.format("%s | ", i.getClass().getSimpleName())));
        return toppingNames;
    }
}
