package com.bob.Adapter;

import com.bob.Adaptee.S20210440123_Decoder;
import com.bob.Target.S20210440123_WindowsPlayer;

    public class WindowsPlayerAdapter extends S20210440123_WindowsPlayer {
        private S20210440123_Decoder decoder;
        public WindowsPlayerAdapter(S20210440123_Decoder decoder) {
            this.decoder = decoder;
        }
        @Override
        public void play(String filename) {
            super.play(filename);
            decoder.decode(filename);
        }
    }