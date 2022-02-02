package com.roy.design.facade.cicd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JarBuilder {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public JarFile build(GitClient.Code code) {
        logger.info("Jar 파일 생성 완료");
        return new JarFile();
    }

    public static class JarFile { }

}
