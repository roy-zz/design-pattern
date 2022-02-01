package com.roy.design.abstractfactory.majorlecture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ChemistryGrade1stMajorLecture implements MajorLecture {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final String[] LECTURES = {"일반화학", "생명과학"};

    @Override
    public void getLectures() {
        logger.info("1학년 전공: {}", Arrays.toString(LECTURES));
    }
}
