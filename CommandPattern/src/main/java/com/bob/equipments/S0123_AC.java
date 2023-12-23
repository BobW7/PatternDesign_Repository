package com.bob.equipments;

public class S0123_AC extends S0123_Equipment{

    @Override
    public void turnOn() {
        System.out.println("空调打开了！");
    }

    @Override
    public void turnOff() {
        System.out.println("空调关闭了！");
    }
}
