package com.roy.design.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class DBClient {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private static final String DB_ADDRESS = "127.0.0.1";
    private static final int DB_PORT = 3306;

    abstract protected boolean connect(String dbAddress, int port);
    abstract protected boolean startTransaction();
    abstract protected boolean commit();
    abstract protected boolean disconnect();

    public void insert(Object data) throws Exception {
        if (!connect(DB_ADDRESS, DB_PORT)) throw new Exception("DB Connection 실패");
        if (!startTransaction()) throw new Exception("Transaction 시작 실패");
        log.info("{} 데이터 삽입", data.toString());
        if (!commit()) throw new Exception("Commit 실패");
        if (!disconnect()) throw new Exception("Disconnect 실패");
    }

    public Object select() throws Exception {
        if (!connect(DB_ADDRESS, DB_PORT)) throw new Exception("DB Connection 실패");
        log.info("데이터 조회");
        if (!disconnect()) throw new Exception("Disconnect 실패");
        return "SELECT 결과";
    }

}
