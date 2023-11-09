package FactoryMethod.ConcreetFactory;

import FactoryMethod.ConcreetPayment.S20210440123_CreditCard;
import FactoryMethod.ConcreetPayment.S20210440123_ZhiFuBao;
import FactoryMethod.S20210440123_IPayment;
import FactoryMethod.S20210440123_IPaymentFactory;

public class S20210440123_CreditCardFactory implements S20210440123_IPaymentFactory {
    @Override
    public S20210440123_IPayment createPayment() {
        return new S20210440123_CreditCard();
    }
}
