package com;

public class S20210440123_Pad {
    private String Memory;
    private String Camera;
    private String Screen;
    private String Pen;

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String camera) {
        Camera = camera;
    }

    public String getScreen() {
        return Screen;
    }

    public void setScreen(String screen) {
        Screen = screen;
    }

    public String getPen() {
        return Pen;
    }

    public void setPen(String pen) {
        Pen = pen;
    }

    @Override
    public String toString() {
        return "Pad{" +
                "Memory='" + Memory + '\'' +
                ", Camera='" + Camera + '\'' +
                ", Screen='" + Screen + '\'' +
                ", Pen='" + Pen + '\'' +
                '}';
    }
}
