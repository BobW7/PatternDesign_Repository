package com.bob.Target;

public class S20210440123_LinuxPlayer implements S20210440123_VideoPlayer{

    @Override
    public void play(String filename) {
        System.out.println("正在用Linux播放器播放："+filename);
    }
}
