package com.roy.design.flyweight;

import com.roy.design.flyweight.notshared.VolunteerInfo;
import com.roy.design.flyweight.shared.UniversityInfo;

public class Resume {
    private final VolunteerInfo volunteerInfo;
    private final UniversityInfo universityInfo;

    public Resume(VolunteerInfo volunteerInfo, UniversityInfo universityInfo) {
        this.volunteerInfo = volunteerInfo;
        this.universityInfo = universityInfo;
    }

    public UniversityInfo getUniversityInfo() {
        return universityInfo;
    }

}
