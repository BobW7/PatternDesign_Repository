package com.bob.equipments;

public class S0123_Fan extends S0123_Equipment{

    @Override
    public void turnOn() {
        System.out.println("风扇打开了！");
    }

    @Override
    public void turnOff() {
        System.out.println("风扇关闭了！");
    }
}
