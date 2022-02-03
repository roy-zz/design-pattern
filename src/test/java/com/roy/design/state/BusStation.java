package com.roy.design.state;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusStation {
    private static final Logger LOGGER = LoggerFactory.getLogger(BusStation.class);

    @Test
    void statePatternPractice() {
        Bus bus = new Bus();

        int[] getOnPassengerCounts = {
                9, 20, 7, 6, 10, 4, 3, 20, 20, 0
        };
        int[] getOffPassengerCounts = {
                5, 2, 13, 4, 5, 15, 3, 2, 1, 20
        };

        for (int i = 0; i < getOnPassengerCounts.length; i++) {
            int increasedPassengerCount = getOnPassengerCounts[i] - getOffPassengerCounts[i];
            // 승차한 사람이 많은 경우
            if (increasedPassengerCount > 0) {
                LOGGER.info("승객이 승하차 합니다. 증가한 탑승자의 수는 {}입니다.", increasedPassengerCount);
                bus.getOnTheBus(increasedPassengerCount);
            // 하차한 사람이 많은 경우
            } else if (increasedPassengerCount < 0) {
                LOGGER.info("승객이 승하차 합니다. 감소한 탑승자의 수는 {}입니다.", increasedPassengerCount);
                bus.getOffTheBus(increasedPassengerCount * -1);
            // 승하차한 사람이 동일한 경우
            } else {

            }
        }
    }

}
