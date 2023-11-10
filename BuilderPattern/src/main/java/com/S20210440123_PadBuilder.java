package com;

public abstract class S20210440123_PadBuilder {
    protected S20210440123_Pad pad = new S20210440123_Pad();

    public abstract void buildMemory();

    public abstract void buildCamera();

    public abstract void buildScreen();

    /**
     * 钩子函数，在isInclude为true时，才能设置笔的型号
     *
     * @param isInclude
     */
    public void buildPen(boolean isInclude) {
        if (isInclude) {
            pad.setPen("默认通用型号的笔");
        }
    }
}
