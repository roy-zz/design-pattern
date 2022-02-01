package com.roy.design.builder.manual;

public abstract class DBClientBuilder {
    protected DBClient dbClient;

    public abstract DBClient build();
    public abstract void setAddress(String address);
    public abstract void setPort(int port);
    public abstract void setId(String id);
    public abstract void setPassword(String password);
    public abstract void setDatabase(String database);

}
