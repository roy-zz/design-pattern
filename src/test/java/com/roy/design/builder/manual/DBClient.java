package com.roy.design.builder.manual;

public class DBClient {
    private String address;
    private int port;
    private String id;
    private String password;
    private String database;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    @Override
    public String toString() {
        return "DBClient{" +
                "address='" + address + '\'' +
                ", port=" + port +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", database='" + database + '\'' +
                '}';
    }

}
