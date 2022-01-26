package com.roy.design.strategy;

import com.roy.design.strategy.Burger.BurgerKingMenu;

public class OrderForm {

    private BurgerKingMenu menu;

    public void order(long payment) {
        menu.order(payment);
    }

    public void setMenu(BurgerKingMenu menu) {
        this.menu = menu;
    }

}
