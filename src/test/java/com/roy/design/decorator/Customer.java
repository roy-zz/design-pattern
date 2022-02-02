package com.roy.design.decorator;

import com.roy.design.decorator.menu.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void decoratorPatternPractice() {
        Sandwich hamSandwich = new DefaultSandwich("햄 샌드위치");
        hamSandwich = new Ham(hamSandwich);
        hamSandwich = new Ham(hamSandwich);
        hamSandwich = new Ham(hamSandwich);
        hamSandwich = new Ham(hamSandwich);
        hamSandwich = new Cheese(hamSandwich);
        hamSandwich = new Cheese(hamSandwich);

        Sandwich tunaSandwich = new DefaultSandwich("참치 샌드위치");
        tunaSandwich = new Tuna(tunaSandwich);
        tunaSandwich = new Tuna(tunaSandwich);
        tunaSandwich = new Cheese(tunaSandwich);
        tunaSandwich = new Cheese(tunaSandwich);

        Sandwich veggieSandwich = new DefaultSandwich("베지 샌드위치");
        veggieSandwich = new Vegetable(veggieSandwich);
        veggieSandwich = new Cheese(veggieSandwich);
        veggieSandwich = new Cheese(veggieSandwich);

        final String printFormat = "이름: {}, 가격: {}, 토핑: {}";
        logger.info(printFormat, hamSandwich.getName(), hamSandwich.cost(), hamSandwich.getToppingNames());
        logger.info(printFormat, tunaSandwich.getName(), tunaSandwich.cost(), tunaSandwich.getToppingNames());
        logger.info(printFormat, veggieSandwich.getName(), veggieSandwich.cost(), veggieSandwich.getToppingNames());
    }

}
