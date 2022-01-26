package com.roy.design.adapter.step2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OfflineCosmeticsStore {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public enum Cosmetics {
        Lotion(10000),
        Perfume(20000);

        Cosmetics(int price) {
            this.price = price;
        }
        public final int price;
    }

    public Cosmetics order(String name) {
        log.info("{} 주문 완료, 금액: {}", name, Cosmetics.valueOf(name));
        return Cosmetics.valueOf(name);
    }

    public int returns(Cosmetics cosmetics) {
        log.info("{} 반품 완료, 금액: {}", cosmetics, cosmetics.price);
        return cosmetics.price;
    }

}
