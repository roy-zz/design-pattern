package com.roy.design.factorymethod;

import com.roy.design.factorymethod.dbclient.DBClient;
import com.roy.design.factorymethod.factory.DBClientFactory;
import com.roy.design.factorymethod.factory.DefaultDBClientFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    void factoryMethodPatternPractice() {
        DBClientFactory dbClientFactory = new DefaultDBClientFactory();

        DBClient mariaClient = dbClientFactory.create(DBClientFactory.DatabaseType.Maria);
        DBClient redisClient = dbClientFactory.create(DBClientFactory.DatabaseType.Redis);

        mariaClient.insert();
        log.info("{}", mariaClient.select());

        redisClient.insert();
        log.info("{}", redisClient.select());
    }

}
