package com.roy.design.observer.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Developer implements Observer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void update(String serverName, int cpuUsage, int memoryUsage) {
        logger.info("개발자: {}, 서버: {}, CPU 사용량: {}%, 메모리 사용량: {}%",
                name, serverName, cpuUsage, memoryUsage);
    }

}
