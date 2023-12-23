package com.bob.command;

import com.bob.S0123_Television;

public class S0123_TurnOffCommand implements S0123_Command {
    private final S0123_Television television;

    public S0123_TurnOffCommand(S0123_Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}