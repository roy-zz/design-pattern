package com.roy.design.abstractfactory.majorlecture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ComputerGrade1stMajorLecture implements MajorLecture {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final String[] LECTURES = {"C++ 프로그래밍", "이산수학"};

    @Override
    public void getLectures() {
        logger.info("1학년 전공: {}", Arrays.toString(LECTURES));
    }
}
