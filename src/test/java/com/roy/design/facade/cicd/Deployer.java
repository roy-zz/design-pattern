package com.roy.design.facade.cicd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Deployer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public boolean deploy() {
        logger.info("새로운 코드 서버 배포 완료");
        return true;
    }
}
