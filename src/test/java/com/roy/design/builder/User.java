package com.roy.design.builder;

import com.roy.design.builder.manual.Creator;
import com.roy.design.builder.manual.DBClient;
import com.roy.design.builder.manual.DBClientBuilder;
import com.roy.design.builder.manual.DefaultDBClientBuilder;
import com.roy.design.builder.used.UsedDBClient;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final String ADDRESS = "192.0.0.1";
    private static final int PORT = 3306;
    private static final String ID = "id";
    private static final String PASSWORD = "password";
    private static final String DATABASE = "database";

    @Test
    void usedBuilderPatternPractice() {
        UsedDBClient usedDBClient = UsedDBClient.builder()
                .address(ADDRESS)
                .port(PORT)
                .id(ID)
                .password(PASSWORD)
                .database(DATABASE)
                .build();
        logger.info("{}", usedDBClient.toString());
    }

    @Test
    void manualBuilderPatternPractice() {
        Creator creator = new Creator();
        DBClientBuilder dbClientBuilder = new DefaultDBClientBuilder();
        creator.setDBClientBuilder(dbClientBuilder);
        DBClient dbClient = creator.constructDBClient();
        logger.info("{}", dbClient.toString());
    }

}
