package com.roy.design.chainofresponsibility.database;

public class Query {
    public enum QueryType {
        INSERT, SELECT, UPDATE, DELETE
    }

    private QueryType queryType;
    private String query;

    public QueryType getQueryType() {
        return queryType;
    }

    public String getQuery() {
        return query;
    }

    public Query(QueryType queryType, String query) {
        this.queryType = queryType;
        this.query = query;
    }
}
