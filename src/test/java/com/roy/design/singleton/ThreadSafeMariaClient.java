package com.roy.design.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public final class ThreadSafeMariaClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(ThreadNonSafeMariaClient.class);
    private static ThreadSafeMariaClient THREAD_SAFE_MARIA_CLIENT;

    private ThreadSafeMariaClient() {}

    public static void connect(ThreadSafeMariaClient threadSafeMariaClient) {
        synchronized (ThreadSafeMariaClient.class) {
            LOGGER.info("Thread Safe {} DB 연결", threadSafeMariaClient.toString());
        }
    }

    public void insert() {
        synchronized (this) {
            LOGGER.info("Thread Safe Select");
        }
    }

    public void select() {
        synchronized (this) {
            LOGGER.info("Thread Safe Select");
        }
    }

    public synchronized static ThreadSafeMariaClient getInstance() {
        if (Objects.isNull(THREAD_SAFE_MARIA_CLIENT)) {
            try {
                Thread.sleep(10);
                LOGGER.info("Thread Safe Client 생성");
                THREAD_SAFE_MARIA_CLIENT = new ThreadSafeMariaClient();
                connect(THREAD_SAFE_MARIA_CLIENT);
            } catch (InterruptedException e) {}
        }
        return THREAD_SAFE_MARIA_CLIENT;
    }

}
