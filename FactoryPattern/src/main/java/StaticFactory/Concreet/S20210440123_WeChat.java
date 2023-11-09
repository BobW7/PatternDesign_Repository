package StaticFactory.Concreet;

import StaticFactory.S20210440123_Payments;

public class S20210440123_WeChat implements S20210440123_Payments {
    public void pay(){
        System.out.println("微信支付");
    }
}
