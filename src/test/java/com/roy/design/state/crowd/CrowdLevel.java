package com.roy.design.state.crowd;

import com.roy.design.state.Bus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CrowdLevel {
    protected static final Logger LOGGER = LoggerFactory.getLogger(CrowdLevel.class);
    protected static final int START_OF_LEVEL1_RANGE = 0;
    protected static final int END_OF_LEVEL1_RANGE = 20;
    protected static final int START_OF_LEVEL2_RANGE = 21;
    protected static final int END_OF_LEVEL2_RANGE = 30;
    protected static final int START_OF_LEVEL3_RANGE = 31;

    public abstract void getOnOffTheBus(Bus bus);
}
