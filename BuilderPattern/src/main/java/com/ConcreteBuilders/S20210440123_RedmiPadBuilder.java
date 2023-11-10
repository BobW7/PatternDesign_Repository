package com.ConcreteBuilders;

import com.S20210440123_PadBuilder;

public class S20210440123_RedmiPadBuilder extends S20210440123_PadBuilder {
    @Override
    public void buildMemory() {
        pad.setMemory("红米内存");
    }

    @Override
    public void buildCamera() {
        pad.setCamera("红米相机");
    }

    @Override
    public void buildScreen() {
        pad.setScreen("红米屏幕");
    }

    @Override
    public void buildPen(boolean isInclude) {
        super.buildPen(false);
    }
}
