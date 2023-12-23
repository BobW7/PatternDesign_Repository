package com.bob.factory;

import com.bob.S0123_RemoteControl;
import com.bob.S0123_Television;
import com.bob.command.S0123_NextChannelCommand;
import com.bob.command.S0123_PrevChannelCommand;
import com.bob.command.S0123_TurnOffCommand;
import com.bob.command.S0123_TurnOnCommand;

public class S0123_LGFactory extends S0123_AbstractFactory {
    @Override
    public S0123_Television createTelevision() {
        return new S0123_Television("LG");
    }

    @Override
    public S0123_RemoteControl createRemoteControl(S0123_Television tv) {
        return new S0123_RemoteControl(new S0123_TurnOnCommand(tv), new S0123_TurnOffCommand(tv),
                new S0123_NextChannelCommand(tv), new S0123_PrevChannelCommand(tv));
    }
}