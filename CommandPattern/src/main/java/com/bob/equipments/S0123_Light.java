package com.bob.equipments;

public class S0123_Light extends S0123_Equipment{

    @Override
    public void turnOn() {
        System.out.println("灯打开了！");
    }

    @Override
    public void turnOff() {
        System.out.println("灯关闭了！");
    }
}
