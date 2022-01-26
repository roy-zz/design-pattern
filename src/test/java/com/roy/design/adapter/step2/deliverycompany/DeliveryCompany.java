package com.roy.design.adapter.step2.deliverycompany;

import com.roy.design.adapter.step2.OfflineCosmeticsStore;

public interface DeliveryCompany {
    OfflineCosmeticsStore.Cosmetics orderAndDelivery(String name);
    int returnAndDelivery(OfflineCosmeticsStore.Cosmetics cosmetics);
}
