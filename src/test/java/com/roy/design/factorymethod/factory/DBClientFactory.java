package com.roy.design.factorymethod.factory;

import com.roy.design.factorymethod.dbclient.DBClient;

public abstract class DBClientFactory {
    public enum DatabaseType {
        Maria, Redis
    }

    public DBClient create(DatabaseType databaseType) {
        DBClient dbClient = createDBClient(databaseType);
        init(dbClient);
        return dbClient;
    }

    abstract protected void init(DBClient dbClient);
    abstract protected DBClient createDBClient(DatabaseType databaseType);
}
