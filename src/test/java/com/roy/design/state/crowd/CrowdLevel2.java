package com.roy.design.state.crowd;

import com.roy.design.state.Bus;

public final class CrowdLevel2 extends CrowdLevel {
    private static final CrowdLevel2 CROWD_LEVEL_2 = new CrowdLevel2();

    private CrowdLevel2() { }

    public static CrowdLevel2 getInstance() {
        return CROWD_LEVEL_2;
    }

    @Override
    public void getOnOffTheBus(Bus bus) {
        if (START_OF_LEVEL1_RANGE <= bus.getPassengerCount()
                && END_OF_LEVEL1_RANGE >= bus.getPassengerCount()) {
            LOGGER.info("버스 승차 인원: {}, 혼잡도가 보통에서 여유로 변경되었습니다.", bus.getPassengerCount());
            bus.setCrowdLevel(CrowdLevel1.getInstance());
        } else if (START_OF_LEVEL2_RANGE <= bus.getPassengerCount()
                && END_OF_LEVEL2_RANGE >= bus.getPassengerCount()) {
            LOGGER.info("버스 승차 인원: {}, 혼잡도는 보통입니다.", bus.getPassengerCount());
        } else if (START_OF_LEVEL3_RANGE <= bus.getPassengerCount()) {
            LOGGER.info("버스 승차 인원: {}, 혼잡도가 보통에서 혼잡으로 변경되었습니다.", bus.getPassengerCount());
            bus.setCrowdLevel(CrowdLevel3.getInstance());
        }
    }

}
