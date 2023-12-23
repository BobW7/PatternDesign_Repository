package com.bob.command;

import com.bob.equipments.S0123_Fan;
import com.bob.equipments.S0123_Light;

import java.util.List;

public class S0123_FanCommand implements S0123_Command {
    private List<S0123_Fan> fans;

    public S0123_FanCommand(List<S0123_Fan> fans) {
        this.fans = fans;
    }


    @Override
    public void execute() {
        for (S0123_Fan fan : fans) {
            fan.turnOn();
        }
    }

    @Override
    public void undo() {
        for (S0123_Fan fan : fans) {
            fan.turnOff();
        }
    }
}
