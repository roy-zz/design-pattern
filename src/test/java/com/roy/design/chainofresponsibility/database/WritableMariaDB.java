package com.roy.design.chainofresponsibility.database;

public class WritableMariaDB extends MariaDB {
    public WritableMariaDB(String name) {
        super(name);
    }

    @Override
    protected boolean execute(Query query) {
        if (Boolean.TRUE == isBusy()) {
            logger.info("DB Name: {}, 현재 DB가 바쁜 상태이므로 처리할 수 없습니다. 다음 DB에게 전달합니다.", name);
            return false;
        } else {
            logger.info("DB Name: {}, Query: {} 처리완료", name, query.getQuery());
            return true;
        }
    }

}
