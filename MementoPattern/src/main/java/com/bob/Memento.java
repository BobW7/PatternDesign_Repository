package com.bob;

// Memento（备忘录）
public class Memento {
    private final String themeColor;
    private final String font;
    private final String layout;

    public Memento(String themeColor, String font, String layout) {
        this.themeColor = themeColor;
        this.font = font;
        this.layout = layout;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public String getFont() {
        return font;
    }

    public String getLayout() {
        return layout;
    }
}