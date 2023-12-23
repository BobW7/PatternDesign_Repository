package com.bob;

public class S0123_Buyer extends S0123_User{
    public S0123_Buyer(S0123_Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("买家 " + name + " 收到消息 " + message);
    }
}
