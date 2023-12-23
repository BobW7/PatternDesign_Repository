package com.bob;

public abstract class S0123_User {
    protected S0123_Mediator mediator;
    protected String name;

    public S0123_User(S0123_Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(this, message);
    }

    public abstract void receiveMessage(String message);
}