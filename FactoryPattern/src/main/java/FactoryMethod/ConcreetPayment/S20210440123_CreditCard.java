package FactoryMethod.ConcreetPayment;

import FactoryMethod.S20210440123_IPayment;

public class S20210440123_CreditCard implements S20210440123_IPayment {
    @Override
    public void pay() {
        System.out.println("信用卡支付——工厂方法模式");
    }
}
