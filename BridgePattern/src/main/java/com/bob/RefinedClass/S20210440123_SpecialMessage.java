package com.bob.RefinedClass;

import com.bob.AbstractClass.S20210440123_Message;
import com.bob.Implementor.S20210440123_SendType;

public class S20210440123_SpecialMessage extends S20210440123_Message {
    public S20210440123_SpecialMessage(S20210440123_SendType sendType) {
        super(sendType);
    }

    @Override
    public void display() {
        System.out.print("发送特殊消息，用户必须做出响应，如果没有做出响应则会每隔30分钟发送一次，直到用户做出响应或者已经重复发送了五次");
        sendType.send();
        System.out.println();
    }
}
