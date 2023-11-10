package com.ConcreteBuilders;

import com.S20210440123_PadBuilder;

public class S20210440123_HuaweiPadBuilder extends S20210440123_PadBuilder {
    @Override
    public void buildMemory() {
        pad.setMemory("华为内存");
    }

    @Override
    public void buildCamera() {
        pad.setCamera("华为相机");
    }

    @Override
    public void buildScreen() {
        pad.setScreen("华为屏幕");
    }

    @Override
    public void buildPen(boolean isInclude) {
        if (isInclude) {
            super.buildPen(true);
        }
    }
}
