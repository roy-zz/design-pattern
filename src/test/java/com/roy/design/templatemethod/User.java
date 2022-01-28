package com.roy.design.templatemethod;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    void templateMethodPatternPractice() {
        try {
            DBClient dbClient = new MariaDBClient();
            String insertData = "새로운 데이터";
            dbClient.insert(insertData);
            log.info("{}", dbClient.select());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
