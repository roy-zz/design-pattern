package com.roy.design.singleton;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class User {
    private static final Logger LOGGER = LoggerFactory.getLogger(User.class);

    @Test
    void singletonPatternPractice() throws Exception {
        UserThread[] userThreads = {
                new UserThread("1번 쓰레드"),
                new UserThread("2번 쓰레드"),
                new UserThread("3번 쓰레드"),
                new UserThread("4번 쓰레드"),
                new UserThread("5번 쓰레드")
        };

        Arrays.asList(userThreads).forEach(
                UserThread::start
        );

        Thread.sleep(1000L);
    }

}
