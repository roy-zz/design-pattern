package com.roy.design.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserThread extends Thread {
    private static final Logger LOGGER = LoggerFactory.getLogger(User.class);

    public UserThread(String threadName) {
        super(threadName);
    }
    public void run() {
        LOGGER.info("{}", Thread.currentThread().getName());
        InitializedMariaClient initializedMariaClient = InitializedMariaClient.getInstance();
        LOGGER.info("{}", initializedMariaClient.toString());
    }
}


//LOGGER.info("{}", Thread.currentThread().getName());
//ThreadSafeMariaClient threadSafeMariaClient = ThreadSafeMariaClient.getInstance();
//LOGGER.info("{}", threadSafeMariaClient.toString());
//ThreadNonSafeMariaClient threadNonSafeMariaClient = ThreadNonSafeMariaClient.getInstance();
//LOGGER.info("{}", threadNonSafeMariaClient.toString());