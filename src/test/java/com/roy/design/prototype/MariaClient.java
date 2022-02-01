package com.roy.design.prototype;

public class MariaClient extends DBClient {

    public MariaClient(String connectionName, String address, int port, String id, String password) throws InterruptedException {
        super(connectionName, address, port, id, password);
    }

    @Override
    public DBClient copy(String connectionName, String address) throws CloneNotSupportedException {
        MariaClient mariaClient = (MariaClient) clone();
        mariaClient.connectionName = connectionName;
        mariaClient.address = address;
        return mariaClient;
    }

    @Override
    public void select() {
        logger.info("PORT: {}, ID: {}, PASSWORD: {}", port, id, address);
        logger.info("Connection Name: {}, Address: {}", connectionName, address);
        logger.info("SELECT 시작");
    }

}
