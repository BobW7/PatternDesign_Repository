package com.bob.command;

import com.bob.S0123_Television;

public class S0123_TurnOnCommand implements S0123_Command {
    private final S0123_Television television;

    public S0123_TurnOnCommand(S0123_Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}