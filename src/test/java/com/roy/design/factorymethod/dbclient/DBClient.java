package com.roy.design.factorymethod.dbclient;

public interface DBClient {
    void insert();
    String select();
    void connect();
}
