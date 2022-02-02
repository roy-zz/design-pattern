package com.roy.design.decorator.menu;

public class DefaultSandwich extends Sandwich {

    public DefaultSandwich(String name) {
        super(name);
    }

    @Override
    public int cost() {
        return 3000;
    }
}
