package StaticFactory.Concreet;

import StaticFactory.S20210440123_Payments;

public class S20210440123_PayPal implements S20210440123_Payments {
    public void pay() {
        System.out.println("贝宝支付");
    }
}
