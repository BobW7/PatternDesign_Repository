package FactoryMethod.ConcreetFactory;

import FactoryMethod.ConcreetPayment.S20210440123_WeChat;
import FactoryMethod.ConcreetPayment.S20210440123_ZhiFuBao;
import FactoryMethod.S20210440123_IPayment;
import FactoryMethod.S20210440123_IPaymentFactory;

public class S20210440123_WeChatFactory implements S20210440123_IPaymentFactory {
    @Override
    public S20210440123_IPayment createPayment() {
        return new S20210440123_WeChat();
    }
}
