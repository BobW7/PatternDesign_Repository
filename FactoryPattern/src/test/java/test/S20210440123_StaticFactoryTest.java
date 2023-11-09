package test;

import StaticFactory.S20210440123_PaymentFactory;
import StaticFactory.S20210440123_Payments;
import org.junit.Test;

public class S20210440123_StaticFactoryTest {
    S20210440123_Payments payment;

    @Test
    public void Test() {
        payment = S20210440123_PaymentFactory.createZhiFuBao();
        payment.pay();
         payment = S20210440123_PaymentFactory.createWeChat();
        payment.pay();
         payment = S20210440123_PaymentFactory.createCreditCard();
        payment.pay();
         payment = S20210440123_PaymentFactory.createPayPal();
        payment.pay();
    }
}
