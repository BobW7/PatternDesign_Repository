package com.bob;

public class S0123_Seller extends S0123_User{
    public S0123_Seller(S0123_Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("卖家 " + name + " 收到消息 " + message);
    }
}
