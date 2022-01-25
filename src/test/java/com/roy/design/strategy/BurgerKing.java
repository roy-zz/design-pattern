package com.roy.design.strategy;

import org.junit.jupiter.api.Test;

public class BurgerKing {

    @Test
    void strategyPatternPractice() {
        Customer customer = new Customer(15000L);

        customer.setMenu(new Wafer());
        customer.order();
        customer.setMenu(new CheeseWafer());
        customer.order();
        customer.setMenu(new DoubleWafer());
        customer.order();

    }

}
