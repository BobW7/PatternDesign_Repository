package com.bob.factory;

import com.bob.S0123_RemoteControl;
import com.bob.S0123_Television;

public abstract class S0123_AbstractFactory {
    public abstract S0123_Television createTelevision();

    public abstract S0123_RemoteControl createRemoteControl(S0123_Television tv);
}