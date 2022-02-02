package com.roy.design.chainofresponsibility;

import com.roy.design.chainofresponsibility.database.MariaDB;
import com.roy.design.chainofresponsibility.database.Query;
import com.roy.design.chainofresponsibility.database.ReadOnlyMariaDB;
import com.roy.design.chainofresponsibility.database.WritableMariaDB;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.roy.design.chainofresponsibility.database.Query.QueryType.*;

public class Client {

    @Test
    void chainOfResponsibilityPatternPractice() {
        MariaDB readOnlyMariaDB = new ReadOnlyMariaDB("ReadOnly DB");
        MariaDB writableMariaDB = new WritableMariaDB("Writable DB");
        readOnlyMariaDB.setNextMariaDB(writableMariaDB);

        Query[] queries = {
                new Query(INSERT, "INSERT query - 1"),
                new Query(SELECT, "SELECT query - 1"),
                new Query(UPDATE, "UPDATE query - 1"),
                new Query(DELETE, "DELETE query - 1"),
                new Query(INSERT, "INSERT query - 2"),
                new Query(SELECT, "SELECT query - 2"),
                new Query(UPDATE, "UPDATE query - 2"),
                new Query(DELETE, "DELETE query - 2")
        };

        Arrays.asList(queries).forEach(readOnlyMariaDB::process);
    }

}
