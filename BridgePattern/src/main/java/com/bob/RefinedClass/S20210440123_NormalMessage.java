package com.bob.RefinedClass;

import com.bob.AbstractClass.S20210440123_Message;
import com.bob.Implementor.S20210440123_SendType;

public class S20210440123_NormalMessage extends S20210440123_Message {

    public S20210440123_NormalMessage(S20210440123_SendType sendType) {
        super(sendType);
    }

    @Override
    public void display() {
        System.out.print("发送普通消息，告知用户快递的状态，不需要用户反馈信息");
        sendType.send();
        System.out.println();
    }
}
