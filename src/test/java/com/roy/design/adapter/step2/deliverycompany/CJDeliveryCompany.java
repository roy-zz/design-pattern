package com.roy.design.adapter.step2.deliverycompany;

import com.roy.design.adapter.step2.OfflineCosmeticsStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CJDeliveryCompany implements DeliveryCompany {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    OfflineCosmeticsStore offlineCosmeticsStore = new OfflineCosmeticsStore();

    @Override
    public OfflineCosmeticsStore.Cosmetics orderAndDelivery(String name) {
        OfflineCosmeticsStore.Cosmetics orderCosmetics = offlineCosmeticsStore.order(name);
        log.info("{}: 주문 배송 시작", orderCosmetics.name());
        return orderCosmetics;
    }

    @Override
    public int returnAndDelivery(OfflineCosmeticsStore.Cosmetics cosmetics) {
        log.info("{}: 반품 배송 시작", cosmetics.name());
        return offlineCosmeticsStore.returns(cosmetics);
    }
}
