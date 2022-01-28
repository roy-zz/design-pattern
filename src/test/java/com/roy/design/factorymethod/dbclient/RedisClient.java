package com.roy.design.factorymethod.dbclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedisClient extends DBClient {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public void insert() {
        log.info("Redis 데이터 삽입");
    }

    @Override
    public String select() {
        log.info("Redis 데이터 조회");
        return "조회된 Redis 데이터";
    }

    @Override
    public void connect() {
        log.info("Redis 초기화, DB Connected");
    }
}
