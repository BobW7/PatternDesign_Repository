package com.bob;

import java.util.ArrayList;
import java.util.List;

public class S0123_TradePlatform implements S0123_Mediator {
    private List<S0123_User> users;

    public S0123_TradePlatform() {
        users = new ArrayList<>();
    }

    public void registerUser(S0123_User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(S0123_User user, String message) {
        //这里可以加一些校验，例如如果message中有敏感信息则拦截
        for (S0123_User u : users) {
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }
}