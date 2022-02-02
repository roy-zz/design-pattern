package com.roy.design.facade.cicd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DockerClient {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public DockerImage build(JarBuilder.JarFile jarFile) {
        logger.info("Docker Image 생성 완료");
        return new DockerImage();
    }

    public boolean push(DockerImage dockerImage) {
        logger.info("Docker Image Repository에 Push 완료");
        return true;
    }

    public static class DockerImage { }

}
