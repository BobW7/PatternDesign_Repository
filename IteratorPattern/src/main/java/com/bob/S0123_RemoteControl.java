package com.bob;

import com.bob.command.S0123_Command;

public class S0123_RemoteControl {
    private final S0123_Command turnOnCommand;
    private final S0123_Command turnOffCommand;
    private final S0123_Command nextChannelCommand;
    private final S0123_Command prevChannelCommand;

    public S0123_RemoteControl(S0123_Command turnOnCommand, S0123_Command turnOffCommand, S0123_Command nextChannelCommand, S0123_Command prevChannelCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
        this.nextChannelCommand = nextChannelCommand;
        this.prevChannelCommand = prevChannelCommand;
    }

    public void turnOn() {
        turnOnCommand.execute();
    }

    public void turnOff() {
        turnOffCommand.execute();
    }

    public void nextChannel() {
        nextChannelCommand.execute();
    }

    public void prevChannel() {
        prevChannelCommand.execute();
    }
}