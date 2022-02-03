package com.roy.design.state;

import com.roy.design.state.crowd.CrowdLevel;
import com.roy.design.state.crowd.CrowdLevel1;

public class Bus {
    private CrowdLevel crowdLevel = CrowdLevel1.getInstance();
    private int passengerCount = 0;

    public void setCrowdLevel(CrowdLevel crowdLevel) {
        this.crowdLevel = crowdLevel;
    }

    public void getOnTheBus(int passengerCount) {
        this.passengerCount+=passengerCount;
        crowdLevel.getOnOffTheBus(this);
    }

    public void getOffTheBus(int passengerCount) {
        this.passengerCount-=passengerCount;
        crowdLevel.getOnOffTheBus(this);
    }

    public int getPassengerCount() {
        return passengerCount;
    }

}
