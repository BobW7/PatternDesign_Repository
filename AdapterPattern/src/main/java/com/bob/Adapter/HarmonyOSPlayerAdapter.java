package com.bob.Adapter;

import com.bob.Target.S20210440123_HarmonyOSPlayer;
import com.bob.Adaptee.S20210440123_Decoder;

public class HarmonyOSPlayerAdapter extends S20210440123_HarmonyOSPlayer {
    private S20210440123_Decoder decoder;

    public HarmonyOSPlayerAdapter(S20210440123_Decoder decoder) {
        this.decoder = decoder;
    }

    @Override
    public void play(String filename) {
        super.play(filename);
       decoder.decode(filename);
    }
}