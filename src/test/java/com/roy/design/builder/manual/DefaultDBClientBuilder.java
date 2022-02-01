package com.roy.design.builder.manual;

public class DefaultDBClientBuilder extends DBClientBuilder {

    private static final String ADDRESS = "192.0.0.1";
    private static final int PORT = 3306;
    private static final String ID = "id";
    private static final String PASSWORD = "password";
    private static final String DATABASE = "database";

    public DefaultDBClientBuilder() {
        dbClient = new DBClient();
    }

    public DBClient build() {
        setAddress(ADDRESS);
        setPort(PORT);
        setId(ID);
        setPassword(PASSWORD);
        setDatabase(DATABASE);
        return dbClient;
    }

    @Override
    public void setAddress(String address) {
        dbClient.setAddress(address);
    }
    @Override
    public void setPort(int port) {
        dbClient.setPort(port);
    }

    @Override
    public void setId(String id) {
        dbClient.setId(id);
    }

    @Override
    public void setPassword(String password) {
        dbClient.setPassword(password);
    }

    @Override
    public void setDatabase(String database) {
        dbClient.setDatabase(database);
    }

}
