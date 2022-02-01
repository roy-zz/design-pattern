package com.roy.design.abstractfactory.majorlecture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ComputerGrade2ndMajorLecture implements MajorLecture {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final String[] LECTURES = {"컴퓨터 구조", "컴퓨터 네트워크"};

    @Override
    public void getLectures() {
        logger.info("2학년 전공: {}", Arrays.toString(LECTURES));
    }
}
