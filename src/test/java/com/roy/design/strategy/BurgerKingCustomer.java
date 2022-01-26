package com.roy.design.strategy;

import com.roy.design.strategy.Burger.CheeseWafer;
import com.roy.design.strategy.Burger.DoubleWafer;
import com.roy.design.strategy.Burger.Wafer;
import org.junit.jupiter.api.Test;

public class BurgerKingCustomer {

    @Test
    void strategyPatternPractice() {
        OrderForm orderForm = new OrderForm();

        orderForm.setMenu(new Wafer());
        orderForm.order(10000L);

        orderForm.setMenu(new CheeseWafer());
        orderForm.order(10000L);

        orderForm.setMenu(new DoubleWafer());
        orderForm.order(5000L);

    }

}
