package com.roy.design.prototype;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final int PORT = 3306;
    private static final String ID = "mariaId";
    private static final String PASSWORD = "mariaPassword";

    @Test
    void prototypePatternPractice() throws CloneNotSupportedException, InterruptedException {
        long start = System.currentTimeMillis();

        List<MariaClient> mariaClients = new ArrayList<>();

        MariaClient mariaClient1 = new MariaClient(
                "1번 Client", "192.168.0.1", PORT, ID, PASSWORD
        );
        mariaClients.add(mariaClient1);
        mariaClients.add((MariaClient) mariaClient1.copy("2번 Client", "192.168.0.2"));
        mariaClients.add((MariaClient) mariaClient1.copy("3번 Client", "192.168.0.3"));
        mariaClients.add((MariaClient) mariaClient1.copy("4번 Client", "192.168.0.4"));
        mariaClients.add((MariaClient) mariaClient1.copy("5번 Client", "192.168.0.5"));
        mariaClients.forEach(MariaClient::select);

        long end = System.currentTimeMillis();
        logger.info("실행 시간: {} 초", (end - start) / 1000);
    }

    @Test
    void nonPrototypePatternPractice() throws InterruptedException {
        long start = System.currentTimeMillis();

        List<MariaClient> mariaClients = new ArrayList<>();

        mariaClients.add(new MariaClient(
                "1번 Client", "192.168.0.1", PORT, ID, PASSWORD
        ));
        mariaClients.add(new MariaClient(
                "2번 Client", "192.168.0.2", PORT, ID, PASSWORD
        ));
        mariaClients.add(new MariaClient(
                "3번 Client", "192.168.0.3", PORT, ID, PASSWORD
        ));
        mariaClients.add(new MariaClient(
                "4번 Client", "192.168.0.4", PORT, ID, PASSWORD
        ));
        mariaClients.add(new MariaClient(
                "5번 Client", "192.168.0.5", PORT, ID, PASSWORD
        ));
        mariaClients.forEach(MariaClient::select);

        long end = System.currentTimeMillis();
        logger.info("실행 시간: {} 초", (end - start) / 1000);
    }

}
