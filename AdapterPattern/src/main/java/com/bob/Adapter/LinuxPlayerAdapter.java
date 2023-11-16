package com.bob.Adapter;

import com.bob.Adaptee.S20210440123_Decoder;
import com.bob.Target.S20210440123_LinuxPlayer;

public class LinuxPlayerAdapter extends S20210440123_LinuxPlayer {

    private S20210440123_Decoder decoder;
    public LinuxPlayerAdapter(S20210440123_Decoder decoder) {
        this.decoder = decoder;
    }
    @Override
    public void play(String filename) {
        super.play(filename);
        decoder.decode(filename);
    }
}