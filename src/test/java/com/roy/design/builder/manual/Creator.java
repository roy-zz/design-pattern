package com.roy.design.builder.manual;

public class Creator {
    private DBClientBuilder dbClientBuilder;

    public void setDBClientBuilder(DBClientBuilder dbClientBuilder) {
        this.dbClientBuilder = dbClientBuilder;
    }

    public DBClient constructDBClient() {
        return dbClientBuilder.build();
    }

}
