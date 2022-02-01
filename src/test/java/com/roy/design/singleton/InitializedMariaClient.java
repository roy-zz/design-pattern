package com.roy.design.singleton;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class InitializedMariaClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(InitializedMariaClient.class);
    private static final InitializedMariaClient INITIALIZED_MARIA_CLIENT = new InitializedMariaClient();

    private InitializedMariaClient() {}

    public static InitializedMariaClient getInstance() {
        return INITIALIZED_MARIA_CLIENT;
    }
}
