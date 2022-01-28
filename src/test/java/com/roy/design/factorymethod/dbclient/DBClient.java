package com.roy.design.factorymethod.dbclient;

public abstract class DBClient {
    public abstract void insert();
    public abstract String select();
    public abstract void connect();
}
