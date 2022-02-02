package com.roy.design.visitor.store;

import com.roy.design.visitor.visitor.Human;

public interface Store {
    void accept(Human human);
    void addVisitor();
    int getTotalSeat();
    int getUsedSeat();
}
