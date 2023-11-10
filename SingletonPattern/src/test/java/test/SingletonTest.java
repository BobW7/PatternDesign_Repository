package test;

import HungrySingleton.S20210440123_HungrySingleton;
import LimitedSingleton.S20210440123_HungryLimitedSingleton;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void test(){
        S20210440123_HungrySingleton bob1 = S20210440123_HungrySingleton.getInstance();
        S20210440123_HungrySingleton bob2 = S20210440123_HungrySingleton.getInstance();
        System.out.println(bob1);
        System.out.println(bob2);

        S20210440123_HungryLimitedSingleton a1 = S20210440123_HungryLimitedSingleton.getInstance();
        S20210440123_HungryLimitedSingleton a2 = S20210440123_HungryLimitedSingleton.getInstance();
        S20210440123_HungryLimitedSingleton a3 = S20210440123_HungryLimitedSingleton.getInstance();
        S20210440123_HungryLimitedSingleton a4 = S20210440123_HungryLimitedSingleton.getInstance();
        S20210440123_HungryLimitedSingleton a5 = S20210440123_HungryLimitedSingleton.getInstance();
    }
}
