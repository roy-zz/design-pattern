package com.roy.design.mediator.colleague;

import com.roy.design.mediator.mediator.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChattingUser implements User {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final Server chattingServer;
    private final int chattingRoomNumber;
    private final String name;

    public ChattingUser(Server chattingServer, int chattingRoomNumber, String name) {
        this.chattingServer = chattingServer;
        this.chattingRoomNumber = chattingRoomNumber;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        logger.info("발신자: {}, 채팅방 번호: {}, 전송할 메시지: {}",
                this.name, this.chattingRoomNumber, message);
        chattingServer.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(User user, String message) {
        logger.info("발신자: {}, 수신자: {}, 채팅방 번호: {}, 전송받은 메시지: {}",
                user.getName(), this.name, user.getChattingRoomNumber(), message);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getChattingRoomNumber() {
        return chattingRoomNumber;
    }

}
