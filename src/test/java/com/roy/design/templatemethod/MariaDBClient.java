package com.roy.design.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MariaDBClient extends DBClient {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Override
    protected boolean connect(String dbAddress, int dbPort) {
        log.info("MariaDB {}:{} 연결 성공", dbAddress, dbPort);
        return true;
    }

    @Override
    protected boolean startTransaction() {
        log.info("MariaDB 트랜잭션 시작");
        return true;
    }

    @Override
    protected boolean commit() {
        log.info("MariaDB 커밋");
        return true;
    }

    @Override
    protected boolean disconnect() {
        log.info("MariaDB 연결 해제");
        return true;
    }
}
