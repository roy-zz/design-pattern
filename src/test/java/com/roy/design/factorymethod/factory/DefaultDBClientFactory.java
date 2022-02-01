package com.roy.design.factorymethod.factory;

import com.roy.design.factorymethod.dbclient.DBClient;
import com.roy.design.factorymethod.dbclient.MariaClient;
import com.roy.design.factorymethod.dbclient.RedisClient;

public class DefaultDBClientFactory extends DBClientFactory {
    @Override
    protected void init(DBClient dbClient) {
        dbClient.connect();
    }

    @Override
    protected DBClient createDBClient(DatabaseType databaseType) {
        switch (databaseType) {
            case Maria:
                return new MariaClient();
            case Redis:
                return new RedisClient();
            default:
                return null;
        }
    }

}
