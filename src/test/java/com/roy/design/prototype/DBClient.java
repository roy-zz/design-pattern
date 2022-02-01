package com.roy.design.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class DBClient implements Cloneable {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected String connectionName;
    protected String address;
    protected final int port;
    protected final String id;
    protected final String password;
    public abstract DBClient copy(String connectionName, String address) throws CloneNotSupportedException;
    public abstract void select();

    protected DBClient(String connectionName, String address, int port, String id, String password) throws InterruptedException {
        Thread.sleep(1000L);
        this.connectionName = connectionName;
        this.address = address;
        this.port = port;
        this.id = id;
        this.password = password;
    }

}
