package com.roy.design.singleton;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class User {

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
