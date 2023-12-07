package com.bob;

// Originator（发起人）
public class Settings {
    private String themeColor;
    private String font;
    private String layout;

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Memento save() {
        return new Memento(themeColor, font, layout);
    }

    public void restore(Memento memento) {
        this.themeColor = memento.getThemeColor();
        this.font = memento.getFont();
        this.layout = memento.getLayout();
    }

    public void displaySettings() {
        System.out.println("Theme Color: " + themeColor);
        System.out.println("Font: " + font);
        System.out.println("Layout: " + layout);
    }
}