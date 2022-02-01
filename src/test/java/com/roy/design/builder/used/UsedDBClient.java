package com.roy.design.builder.used;

public class UsedDBClient {
    public String address;
    public int port;
    public String id;
    public String password;
    public String database;

    private UsedDBClient() {};

    private UsedDBClient(String address, int port, String id, String password, String database) {
        this.address = address;
        this.port = port;
        this.id = id;
        this.password = password;
        this.database = database;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "UsedDBClient{" +
                "address='" + address + '\'' +
                ", port=" + port +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", database='" + database + '\'' +
                '}';
    }

    public static class Builder {
        private String address;
        private int port;
        private String id;
        private String password;
        private String database;

        private Builder() {}

        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public Builder port(int port) {
            this.port = port;
            return this;
        }
        public Builder id(String id) {
            this.id = id;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }
        public Builder database(String database) {
            this.database = database;
            return this;
        }
        public UsedDBClient build() {
            return new UsedDBClient(this.address, this.port, this.id, this.password, this.database);
        }
    }

}
