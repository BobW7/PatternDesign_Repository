package com.bob.ConcreteImplementor;

import com.bob.Implementor.S20210440123_SendType;

public class S20210440123_PhoneSend implements S20210440123_SendType {
    @Override
    public void send() {
        System.out.print(", 使用手机短信发送");
    }
}
