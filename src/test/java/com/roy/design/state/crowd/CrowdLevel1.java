package com.roy.design.state.crowd;

import com.roy.design.state.Bus;

public final class CrowdLevel1 extends CrowdLevel {
    private static final CrowdLevel1 CROWD_LEVEL_1 = new CrowdLevel1();

    private CrowdLevel1() { }

    public static CrowdLevel1 getInstance() {
        return CROWD_LEVEL_1;
    }

    @Override
    public void getOnOffTheBus(Bus bus) {
        if (START_OF_LEVEL1_RANGE <= bus.getPassengerCount()
                && END_OF_LEVEL1_RANGE >= bus.getPassengerCount()) {
            LOGGER.info("버스 승차 인원: {}, 혼잡도는 여유입니다.", bus.getPassengerCount());
        } else if (START_OF_LEVEL2_RANGE <= bus.getPassengerCount()
                && END_OF_LEVEL2_RANGE >= bus.getPassengerCount()) {
            LOGGER.info("버스 승차 인원: {}, 혼잡도가 여유에서 보통으로 변경되었습니다.", bus.getPassengerCount());
            bus.setCrowdLevel(CrowdLevel2.getInstance());
        } else if (START_OF_LEVEL3_RANGE <= bus.getPassengerCount()) {
            LOGGER.info("버스 승차 인원: {}, 혼잡도가 여유에서 혼잡으로 변경되었습니다.", bus.getPassengerCount());
            bus.setCrowdLevel(CrowdLevel3.getInstance());
        }
    }

}
