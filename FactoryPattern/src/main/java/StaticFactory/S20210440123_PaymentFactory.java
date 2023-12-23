package StaticFactory;

import StaticFactory.Concreet.S20210440123_CreditCard;
import StaticFactory.Concreet.S20210440123_PayPal;
import StaticFactory.Concreet.S20210440123_WeChat;
import StaticFactory.Concreet.S20210440123_ZhiFuBao;

/**
 * 这个具体的工厂类负责创建一些类的实例，而这些被创建的类有一个共同的父类或者接口。
 */
public class S20210440123_PaymentFactory {
    public static S20210440123_Payments createZhiFuBao() {
        return new S20210440123_ZhiFuBao();
    }

    public static S20210440123_Payments createWeChat() {
        return new S20210440123_WeChat();
    }

    public static S20210440123_Payments createCreditCard() {
        return new S20210440123_CreditCard();
    }

    public static S20210440123_Payments createPayPal() {
        return new S20210440123_PayPal();
    }

}
