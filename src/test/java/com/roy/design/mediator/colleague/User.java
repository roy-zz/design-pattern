package com.roy.design.mediator.colleague;

public interface User {
    void sendMessage(String message);
    void receiveMessage(User user, String message);
    String getName();
    int getChattingRoomNumber();
}
