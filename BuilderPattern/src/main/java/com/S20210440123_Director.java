package com;

public class S20210440123_Director {
    public S20210440123_PadBuilder padBuilder;

    public void SetPadBuilder(S20210440123_PadBuilder padBuilder) {
        this.padBuilder = padBuilder;
    }

    public S20210440123_Pad Construct(boolean isIncludePen) {
        S20210440123_Pad pad = padBuilder.pad;
        padBuilder.buildMemory();
        padBuilder.buildCamera();
        padBuilder.buildScreen();
        padBuilder.buildPen(isIncludePen);
        return pad;
    }
}
