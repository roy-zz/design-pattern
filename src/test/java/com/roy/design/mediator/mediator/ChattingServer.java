package com.roy.design.mediator.mediator;

import com.roy.design.mediator.colleague.User;

import java.util.ArrayList;
import java.util.List;

public class ChattingServer implements Server {
    private final List<User> chattingUsers = new ArrayList<>();

    @Override
    public void addUser(User user) {
        chattingUsers.add(user);
    }

    @Override
    public void sendMessage(User user, String message) {
        chattingUsers.stream()
                .filter(i -> i.getChattingRoomNumber() == user.getChattingRoomNumber() && !i.equals(user))
                .forEach(i -> i.receiveMessage(user, message));
    }

}
