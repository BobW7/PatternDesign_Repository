package com.bob.test;

import com.bob.Adaptee.S20210440123_AVIDecoder;
import com.bob.Adaptee.S20210440123_MP4Decoder;
import com.bob.Adaptee.S20210440123_MPEGDecoder;
import com.bob.Adaptee.S20210440123_WMVDecoder;
import com.bob.Adapter.HarmonyOSPlayerAdapter;
import com.bob.Adapter.LinuxPlayerAdapter;
import com.bob.Adapter.WindowsPlayerAdapter;
import com.bob.Target.S20210440123_HarmonyOSPlayer;
import com.bob.Target.S20210440123_LinuxPlayer;
import com.bob.Target.S20210440123_WindowsPlayer;
import org.junit.Test;

public class S20210440123_AdapterPattern {
    @Test
    public void Test() {
        S20210440123_WindowsPlayer windowsPlayer = new WindowsPlayerAdapter(new S20210440123_AVIDecoder());
        windowsPlayer.play("Celtics.avi");

        S20210440123_LinuxPlayer linuxPlayer = new LinuxPlayerAdapter(new S20210440123_MP4Decoder());
        linuxPlayer.play("Lakers.mp4");

        S20210440123_HarmonyOSPlayer harmonyOSPlayer = new HarmonyOSPlayerAdapter(new S20210440123_WMVDecoder());
        harmonyOSPlayer.play("Timberwolves.wmv");

        harmonyOSPlayer = new HarmonyOSPlayerAdapter(new S20210440123_MPEGDecoder());
        harmonyOSPlayer.play("Timberwolves.mpeg");
    }
}
