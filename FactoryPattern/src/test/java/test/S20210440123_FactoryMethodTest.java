package test;

import FactoryMethod.ConcreetFactory.S20210440123_CreditCardFactory;
import FactoryMethod.ConcreetFactory.S20210440123_WeChatFactory;
import FactoryMethod.ConcreetFactory.S20210440123_ZhiFuBaoFactory;
import FactoryMethod.S20210440123_IPayment;
import FactoryMethod.S20210440123_IPaymentFactory;
import org.junit.Test;

public class S20210440123_FactoryMethodTest {
    S20210440123_IPaymentFactory factory;
    S20210440123_IPayment payment;

    @Test
    public void Test1() {
        //用支付宝工厂实例化工厂接口
        factory = new S20210440123_ZhiFuBaoFactory();
        payment = factory.createPayment();
        payment.pay();
    }

    @Test
    public void Test2() {
        //用微信工厂实例化工厂接口
        factory = new S20210440123_WeChatFactory();
        payment = factory.createPayment();
        payment.pay();
    }

    @Test
    public void Test3() {
        //用信用卡工厂实例化工厂接口
        factory = new S20210440123_CreditCardFactory();
        payment = factory.createPayment();
        payment.pay();
    }
}
