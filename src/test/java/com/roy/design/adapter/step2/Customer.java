package com.roy.design.adapter.step2;

import com.roy.design.adapter.step2.deliverycompany.CJDeliveryCompany;
import com.roy.design.adapter.step2.deliverycompany.DeliveryCompany;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    void adapterPatternPractice() {
        DeliveryCompany deliveryCompany = new CJDeliveryCompany();

        // 로션 주문 및 배송
        OfflineCosmeticsStore.Cosmetics cosmetics =
                deliveryCompany.orderAndDelivery("Lotion");
        log.info("{}: 상품 주문 및 배송 완료", cosmetics.name());

        // 로션 반품 및 배송
        int returnMoney = deliveryCompany.returnAndDelivery(cosmetics);
        log.info("{}: 상품 반품 및 배송 완료, 반품 금액: {}", cosmetics.name(), returnMoney);

    }
}
