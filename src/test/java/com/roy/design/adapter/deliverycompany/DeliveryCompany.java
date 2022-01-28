package com.roy.design.adapter.deliverycompany;

import com.roy.design.adapter.OfflineCosmeticsStore;

public interface DeliveryCompany {

    OfflineCosmeticsStore.Cosmetics orderAndDelivery(String name);
    int returnAndDelivery(OfflineCosmeticsStore.Cosmetics cosmetics);

}
