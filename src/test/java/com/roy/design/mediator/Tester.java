package com.roy.design.mediator;

import com.roy.design.mediator.colleague.ChattingUser;
import com.roy.design.mediator.colleague.User;
import com.roy.design.mediator.mediator.ChattingServer;
import com.roy.design.mediator.mediator.Server;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Tester {

    @Test
    void mediatorPatternPractice() {
        Server chattingServer = new ChattingServer();
        User[] chattingUsers = {
                new ChattingUser(chattingServer, 1, "1번 사용자"),
                new ChattingUser(chattingServer, 1, "2번 사용자"),
                new ChattingUser(chattingServer, 2, "3번 사용자"),
                new ChattingUser(chattingServer, 2, "4번 사용자")
        };

        Arrays.stream(chattingUsers).forEach(chattingServer::addUser);

        chattingUsers[0].sendMessage("1번방 사용자 분들 안녕하세요.");
        chattingUsers[2].sendMessage("2번방 사용자 분들 안녕하세요.");

    }

}
