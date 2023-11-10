package com.ConcreteBuilders;

import com.S20210440123_PadBuilder;

public class S20210440123_iPadBuilder extends S20210440123_PadBuilder {
    @Override
    public void buildMemory() {
        pad.setMemory("苹果内存");
    }

    @Override
    public void buildCamera() {
        pad.setCamera("苹果相机");
    }

    @Override
    public void buildScreen() {
        pad.setScreen("苹果屏幕");
    }

    @Override
    public void buildPen(boolean isInclude) {
        super.buildPen(isInclude);
        pad.setPen("苹果版本笔");
    }
}
