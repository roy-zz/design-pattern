package com.roy.design.mediator.mediator;

import com.roy.design.mediator.colleague.User;

public interface Server {
    void addUser(User user);
    void sendMessage(User user, String message);
}
