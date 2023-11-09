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
    public S20210440123_FontB GetFont() {
        S20210440123_FontB fontB = new S20210440123_FontB();
        System.out.println(fontB.CreateFont());
        return fontB;
    }

    @Override
    public S20210440123_ColorB GetColor() {
        S20210440123_ColorB colorB = new S20210440123_ColorB();
        System.out.println(colorB.CreateColor());
        return colorB;
    }
}
