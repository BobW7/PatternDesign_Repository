package test;

import AbstractFactory.S20210440123_IThemeFactory;
import AbstractFactory.Theme.S20210440123_ThemeA;
import AbstractFactory.Theme.S20210440123_ThemeB;
import StaticFactory.S20210440123_PaymentFactory;
import StaticFactory.S20210440123_Payments;
import org.junit.Test;

public class S20210440123_AbstractFactoryTest {
    S20210440123_IThemeFactory theme;
    @Test
    public void Test1() {
        theme = new S20210440123_ThemeA();

    }
    @Test
    public void Test2() {
        theme = new S20210440123_ThemeB();
    }

}
