package FactoryMethod.ConcreetPayment;

import FactoryMethod.S20210440123_IPayment;

public class S20210440123_ZhiFuBao implements S20210440123_IPayment {
    @Override
    public void pay() {
        System.out.println("支付宝支付——工厂方法模式");
    }
}
