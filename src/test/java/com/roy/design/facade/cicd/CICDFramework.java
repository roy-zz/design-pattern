package com.roy.design.facade.cicd;

import java.util.Objects;

public class CICDFramework {
    private final GitClient gitClient;
    private final JarBuilder jarBuilder;
    private final DockerClient dockerClient;
    private final Deployer deployer;

    public CICDFramework(GitClient gitClient, JarBuilder jarBuilder, DockerClient dockerClient, Deployer deployer) {
        this.gitClient = gitClient;
        this.jarBuilder = jarBuilder;
        this.dockerClient = dockerClient;
        this.deployer = deployer;
    }

    public void process() {
        GitClient.Code code = gitClient.pull();
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
}
