package com.roy.design.flyweight;

import com.roy.design.flyweight.notshared.VolunteerInfo;
import com.roy.design.flyweight.shared.JavaUniversityInfo;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static com.roy.design.flyweight.ResumeFactory.UniversityName.*;

public class Company {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void flyweightPatternPractice() {
        VolunteerInfo volunteer1 = new VolunteerInfo("Java 학교 출신 지원자 - 1", 27, "서울시 강남구");
        VolunteerInfo volunteer2 = new VolunteerInfo("Java 학교 출신 지원자 - 2", 28, "서울시 양재동");
        VolunteerInfo volunteer3 = new VolunteerInfo("Java 학교 출신 지원자 - 3", 27, "서울시 강남구");
        VolunteerInfo volunteer4 = new VolunteerInfo("Java 학교 출신 지원자 - 4", 28, "서울시 양재동");
        VolunteerInfo volunteer5 = new VolunteerInfo("Java 학교 출신 지원자 - 5", 27, "서울시 강남구");
        VolunteerInfo volunteer6 = new VolunteerInfo("Java 학교 출신 지원자 - 6", 28, "서울시 양재동");
        VolunteerInfo volunteer7 = new VolunteerInfo("Kotlin 학교 출신 지원자 - 1", 27, "서울시 서초동");
        VolunteerInfo volunteer8 = new VolunteerInfo("Kotlin 학교 출신 지원자 - 2", 28, "서울시 개포동");
        VolunteerInfo volunteer9 = new VolunteerInfo("Python 학교 출신 지원자 - 1", 27, "서울시 청담동");
        VolunteerInfo volunteer10 = new VolunteerInfo("Python 학교 출신 지원자 - 2", 28, "서울시 구로동");

        Resume[] resumes = {
                ResumeFactory.getResume(volunteer1, JAVA),
                ResumeFactory.getResume(volunteer2, JAVA),
                ResumeFactory.getResume(volunteer3, JAVA),
                ResumeFactory.getResume(volunteer4, JAVA),
                ResumeFactory.getResume(volunteer5, JAVA),
                ResumeFactory.getResume(volunteer6, JAVA),
                ResumeFactory.getResume(volunteer7, KOTLIN),
                ResumeFactory.getResume(volunteer8, KOTLIN),
                ResumeFactory.getResume(volunteer9, PYTHON),
                ResumeFactory.getResume(volunteer10, PYTHON)
        };
        logger.info("### JAVA 학교 전화번호 수정 전");
        Arrays.asList(resumes).forEach(i -> logger.info("학교 명: {}, 학교 번호: {}",
                i.getUniversityInfo().getName(), i.getUniversityInfo().getNumber()));

        JavaUniversityInfo javaUniversityInfo = JavaUniversityInfo.getInstance();
        javaUniversityInfo.setNumber("010-9999-8888");

        logger.info("### JAVA 학교 전화번호 수정 후");
        Arrays.asList(resumes).forEach(i -> logger.info("학교 명: {}, 학교 번호: {}",
                i.getUniversityInfo().getName(), i.getUniversityInfo().getNumber()));
    }

}
