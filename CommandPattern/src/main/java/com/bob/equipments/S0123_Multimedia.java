package com.bob.equipments;

public class S0123_Multimedia extends S0123_Equipment{

    @Override
    public void turnOn() {
        System.out.println("多媒体打开了！");
    }

    @Override
    public void turnOff() {
        System.out.println("多媒体关闭了！");
    }
}
