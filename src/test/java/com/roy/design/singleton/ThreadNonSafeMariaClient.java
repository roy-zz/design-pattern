package com.roy.design.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public final class ThreadNonSafeMariaClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(ThreadNonSafeMariaClient.class);
    private static ThreadNonSafeMariaClient THREAD_NON_SAFE_MARIA_CLIENT = null;

    private ThreadNonSafeMariaClient() {}

    private static void connect(ThreadNonSafeMariaClient threadNonSafeMariaClient) {
        LOGGER.info("Thread Non Safe {} DB 연결", threadNonSafeMariaClient.toString());
    }

    public void insert() {
        LOGGER.info("Thread Non Safe Insert");
    }

    public void select() {
        LOGGER.info("Thread Non Safe Select");
    }

    public static ThreadNonSafeMariaClient getInstance() {
        if (Objects.isNull(THREAD_NON_SAFE_MARIA_CLIENT)) {
            try {
                Thread.sleep(100);
                LOGGER.info("Thread Non Safe Client 생성");
                THREAD_NON_SAFE_MARIA_CLIENT = new ThreadNonSafeMariaClient();
                connect(THREAD_NON_SAFE_MARIA_CLIENT);
            } catch (InterruptedException e) {}
        }
        return THREAD_NON_SAFE_MARIA_CLIENT;
    }

}
