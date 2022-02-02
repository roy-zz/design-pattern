package com.roy.design.observer;

import com.roy.design.observer.observer.Developer;
import com.roy.design.observer.subject.ChattingServer;
import com.roy.design.observer.subject.PushServer;
import com.roy.design.observer.subject.Server;
import org.junit.jupiter.api.Test;

public class Tester {

    @Test
    void observerPatternPractice() {
        Developer chattingServerDeveloper1 = new Developer("Chatting 1st Developer");
        Developer chattingServerDeveloper2 = new Developer("Chatting 2nd Developer");
        Developer pushServerDeveloper1 = new Developer("Push 1st Developer");
        Developer pushServerDeveloper2 = new Developer("Push 2nd Developer");

        Server chattingServer = new ChattingServer("Chatting Server");
        chattingServer.attach(chattingServerDeveloper1);
        chattingServer.attach(chattingServerDeveloper2);

        Server pushServer = new PushServer("Push Server");
        pushServer.attach(pushServerDeveloper1);
        pushServer.attach(pushServerDeveloper2);

        for (int i = 0; i < 5; i++) {
            chattingServer.useServer();
            pushServer.useServer();
        }
    }

}
