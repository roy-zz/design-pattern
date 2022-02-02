package com.roy.design.visitor.visitor;

import com.roy.design.visitor.store.Bar;
import com.roy.design.visitor.store.Cafe;
import com.roy.design.visitor.store.Store;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Human {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public abstract void visit(Bar bar);
    public abstract void visit(Cafe cafe);

    protected boolean isVisitable(Store store) {
        return store.getTotalSeat() > store.getUsedSeat();
    }
}
