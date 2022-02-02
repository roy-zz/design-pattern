package com.roy.design.facade;

import com.roy.design.facade.cicd.*;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class Developer {

    @Test
    void nonFacadePatternPractice() {
        GitClient gitClient = new GitClient();
        JarBuilder jarBuilder = new JarBuilder();
        DockerClient dockerClient = new DockerClient();
        Deployer deployer = new Deployer();

        String developedCode = "개발_완료_코드";

        boolean gitPushResult = gitClient.push(developedCode);
        GitClient.Code code = null;
        if (gitPushResult) {
            code = gitClient.pull();
        }

        JarBuilder.JarFile jarFile = null;
        if (Objects.nonNull(code)) {
            jarFile = jarBuilder.build(code);
        }

        DockerClient.DockerImage dockerImage = null;
        if (Objects.nonNull(jarFile)) {
            dockerImage = dockerClient.build(jarFile);
        }

        boolean dockerImagePushResult = false;
        if (Objects.nonNull(dockerImage)) {
            dockerImagePushResult = dockerClient.push(dockerImage);
        }

        if (dockerImagePushResult) {
            deployer.deploy();
        }

    }

    @Test
    void facadePatternPractice() {
        GitClient gitClient = new GitClient();

        CICDFramework cicdFramework = new CICDFramework(
                gitClient, new JarBuilder(), new DockerClient(), new Deployer()
        );

        String developedCode = "개발_완료_코드";
        boolean gitPushResult = gitClient.push(developedCode);

        if (gitPushResult) {
            cicdFramework.process();
        }
    }

}
