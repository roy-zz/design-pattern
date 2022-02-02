package com.roy.design.visitor;

import com.roy.design.visitor.store.Bar;
import com.roy.design.visitor.store.Cafe;
import com.roy.design.visitor.store.Store;
import com.roy.design.visitor.visitor.Adult;
import com.roy.design.visitor.visitor.Human;
import com.roy.design.visitor.visitor.Teenager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Tester {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void visitorPatternPractice() {
        Store cafe = new Cafe();
        Store bar = new Bar();

        Human[] humans = {
                new Adult(), new Teenager(),
                new Adult(), new Teenager(),
                new Adult(), new Teenager(),
                new Adult(), new Teenager()
        };

        logger.info("#### Visitor 카페 방문 시작");
        Arrays.asList(humans).forEach(cafe::accept);
        logger.info("#### Visitor Bar 방문 시작");
        Arrays.asList(humans).forEach(bar::accept);
    }

}
