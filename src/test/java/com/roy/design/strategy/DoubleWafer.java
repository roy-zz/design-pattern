package com.roy.design.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoubleWafer implements BurgerKingMenu {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private static final long COST = 7000;

    @Override
    public long order(long payment) {
        if (payment - COST >= 0) {
            log.info("{}, {}: {}", "더블 와퍼 주문 완료", "거스름 돈", payment - COST);
            return payment - COST;
        } else {
            log.warn("{}, {}", "더블 와퍼 주문 불가", "금액 부족");
            return payment;
        }
    }

}
