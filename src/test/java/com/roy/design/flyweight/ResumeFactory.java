package com.roy.design.flyweight;

import com.roy.design.flyweight.notshared.VolunteerInfo;
import com.roy.design.flyweight.shared.JavaUniversityInfo;
import com.roy.design.flyweight.shared.KotlinUniversityInfo;
import com.roy.design.flyweight.shared.PythonUniversityInfo;
import com.roy.design.flyweight.shared.UniversityInfo;

public class ResumeFactory {
    public static Resume getResume(VolunteerInfo volunteerInfo, UniversityName universityName) {
        return new Resume(volunteerInfo, getUniversityInfo(universityName));
    }

    private static UniversityInfo getUniversityInfo(UniversityName universityName) {
        switch (universityName) {
            case JAVA:
                return JavaUniversityInfo.getInstance();
            case KOTLIN:
                return KotlinUniversityInfo.getInstance();
            case PYTHON:
                return PythonUniversityInfo.getInstance();
            default:
                return null;
        }
    }

    public enum UniversityName {
        JAVA, KOTLIN, PYTHON
    }

}
