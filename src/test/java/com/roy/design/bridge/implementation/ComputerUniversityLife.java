package com.roy.design.bridge.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComputerUniversityLife implements UniversityLife {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void goClassRoom() {
        logger.info("컴퓨터학과 강의실로 간다.");
    }

    @Override
    public void takeMajorClass() {
        logger.info("컴퓨터학과 전공 수업을 듣는다.");
    }
}
