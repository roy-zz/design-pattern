package com.roy.design.facade.cicd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GitClient {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public boolean push(String code) {
        logger.info("코드 Push 완료");
        return true;
    }

    public Code pull() {
        logger.info("코드 Pull 완료");
        return new Code();
    }

    public static class Code { }

}
