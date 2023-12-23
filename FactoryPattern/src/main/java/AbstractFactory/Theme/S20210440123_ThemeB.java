package AbstractFactory.Theme;

import AbstractFactory.Color.S20210440123_ColorB;
import AbstractFactory.Font.S20210440123_FontB;
import AbstractFactory.S20210440123_IThemeFactory;

public class S20210440123_ThemeB implements S20210440123_IThemeFactory {
    public S20210440123_ThemeB() {
        GetFont();
        GetColor();
    }

    @Override
    public void GetFont() {
        S20210440123_FontB fontB = new S20210440123_FontB();
        System.out.println(fontB.CreateFont());
    }

    @Override
    public void GetColor() {
        S20210440123_ColorB colorB = new S20210440123_ColorB();
        System.out.println(colorB.CreateColor());
    }
}
