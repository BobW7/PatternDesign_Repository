package test;

import StaticFactory.S20210440123_PaymentFactory;
import StaticFactory.S20210440123_Payments;
import org.junit.Test;

public class S20210440123_StaticFactoryTest {
    @Test
    public void Test(){

        S20210440123_Payments zhiFuBao = S20210440123_PaymentFactory.createZhiFuBao();
        S20210440123_Payments weChat = S20210440123_PaymentFactory.createWeChat();
        S20210440123_Payments creditCard = S20210440123_PaymentFactory.createCreditCard();
        zhiFuBao.pay();
        weChat.pay();
        creditCard.pay();
    }
}
