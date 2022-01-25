package com.roy.design.strategy;

public class Customer {

    private long money;
    private BurgerKingMenu menu;

    public Customer(long initialMoney) {
        this.money = initialMoney;
    }

    public void order() {
        this.money = menu.order(money);
    }

    public void setMenu(BurgerKingMenu menu) {
        this.menu = menu;
    }

}
