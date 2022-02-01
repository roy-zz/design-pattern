package com.roy.design.abstractfactory.majorlecture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ChemistryGrade2ndMajorLecture implements MajorLecture {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final String[] LECTURES = {"유기화학", "물리화학"};

    @Override
    public void getLectures() {
        logger.info("2학년 전공: {}", Arrays.toString(LECTURES));
    }
}
