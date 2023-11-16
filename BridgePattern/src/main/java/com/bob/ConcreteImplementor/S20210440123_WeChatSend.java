package com.bob.ConcreteImplementor;

import com.bob.Implementor.S20210440123_SendType;

public class S20210440123_WeChatSend implements S20210440123_SendType {
    @Override
    public void send() {
        System.out.print(", 使用微信发送");
    }
}
