package com.bob.AbstractClass;

import com.bob.Implementor.S20210440123_SendType;

public abstract class S20210440123_Message {
    protected S20210440123_SendType sendType;
    public S20210440123_Message(S20210440123_SendType sendType){
        this.sendType = sendType;
    }

    public abstract void display();
}
