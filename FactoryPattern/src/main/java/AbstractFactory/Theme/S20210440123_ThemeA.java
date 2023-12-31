package AbstractFactory.Theme;

import AbstractFactory.Color.S20210440123_ColorA;
import AbstractFactory.Font.S20210440123_FontA;
import AbstractFactory.S20210440123_IThemeFactory;

public class S20210440123_ThemeA implements S20210440123_IThemeFactory {

    public S20210440123_ThemeA() {
        GetFont();
        GetColor();
    }

    @Override
    public void GetFont() {
        S20210440123_FontA fontA = new S20210440123_FontA();
        System.out.println(fontA.CreateFont());
    }

    @Override
    public void GetColor() {
        S20210440123_ColorA colorA = new S20210440123_ColorA();
        System.out.println(colorA.CreateColor());
    }
}
