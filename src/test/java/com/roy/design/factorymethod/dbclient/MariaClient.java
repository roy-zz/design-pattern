package com.roy.design.factorymethod.dbclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MariaClient implements DBClient {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public void insert() {
        log.info("Maria 데이터 삽입");
    }

    @Override
    public String select() {
        log.info("Maria 데이터 조회");
        return "조회된 Maria 데이터";
    }

    @Override
    public void connect() {
        log.info("Maria 초기화, DB Connected");
    }
}
