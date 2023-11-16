package com.bob.test;

import com.bob.AbstractClass.S20210440123_Message;
import com.bob.ConcreteImplementor.S20210440123_PhoneSend;
import com.bob.ConcreteImplementor.S20210440123_WeChatSend;
import com.bob.Implementor.S20210440123_SendType;
import com.bob.RefinedClass.S20210440123_NormalMessage;
import com.bob.RefinedClass.S20210440123_SpecialMessage;
import org.junit.Test;
public class S20210440123_BridgePatternTest {
    private S20210440123_Message message;
    @Test
    public void Test(){
        S20210440123_SendType phoneSend = new S20210440123_PhoneSend();
        S20210440123_SendType weChatSend = new S20210440123_WeChatSend();
        message = new S20210440123_NormalMessage(phoneSend);
        message.display();
        message = new S20210440123_NormalMessage(weChatSend);
        message.display();
        System.out.println("------------------------");

        message = new S20210440123_SpecialMessage(phoneSend);
        message.display();
        message = new S20210440123_SpecialMessage(weChatSend);
        message.display();
    }
}
