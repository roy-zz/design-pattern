package com.roy.design.visitor.store;

import com.roy.design.visitor.visitor.Human;

public class Cafe implements Store {
    private static final int TOTAL_SEAT = 5;
    private int usedSeat = 0;

    @Override
    public void accept(Human human) {
        human.visit(this);
    }

    @Override
    public void addVisitor() {
        usedSeat++;
    }

    @Override
    public int getTotalSeat() {
        return TOTAL_SEAT;
    }

    @Override
    public int getUsedSeat() {
        return usedSeat;
    }

}
