package com.roy.design.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wafer implements BurgerKingMenu {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private static final long COST = 5000;

    @Override
    public long order(long payment) {
        if (payment - COST >= 0) {
            log.info("{}, {}: {}", "와퍼 주문 완료", "거스름 돈", payment - COST);
            return payment - COST;
        } else {
            log.warn("{}, {}", "와퍼 주문 불가", "금액 부족");
            return payment;
        }
    }

}
