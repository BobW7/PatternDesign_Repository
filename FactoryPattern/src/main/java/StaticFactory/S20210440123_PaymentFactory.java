package StaticFactory;

import StaticFactory.Concreet.S20210440123_CreditCard;
import StaticFactory.Concreet.S20210440123_WeChat;
import StaticFactory.Concreet.S20210440123_ZhiFuBao;

public class S20210440123_PaymentFactory {
  public static   S20210440123_Payments createZhiFuBao(){
      return new S20210440123_ZhiFuBao();
  }
  public static   S20210440123_Payments createWeChat(){
        return new S20210440123_WeChat();
  }
  public static   S20210440123_Payments createCreditCard(){
        return new S20210440123_CreditCard();
    }

}
