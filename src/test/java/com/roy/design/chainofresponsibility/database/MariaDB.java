package com.roy.design.chainofresponsibility.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public abstract class MariaDB {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    private MariaDB nextMariaDB;
    protected final String name;
    private final Random random = new Random();

    public MariaDB(String name) {
        this.name = name;
    }

    public void setNextMariaDB(MariaDB mariaDB) {
        this.nextMariaDB = mariaDB;
    }

    public void process(Query query) {
        if (execute(query)) {
        } else {
            nextMariaDB.execute(query);
        }
        logger.info("처리가능한 DB 없음");
    }

    protected abstract boolean execute(Query query);
    protected boolean isBusy() {
        return random.nextBoolean();
    }

}
