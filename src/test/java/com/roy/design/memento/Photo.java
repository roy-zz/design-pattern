package com.roy.design.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

public class Photo {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final String name;
    private final LocalDate createdAt;

    public Photo(String name, LocalDate createdAt) {
        this.name = name;
        this.createdAt = createdAt;
    }

    public void printPhotoInfo() {
        logger.info("사진 명: {}, 생성일자: {}", name, createdAt);
    }

}
