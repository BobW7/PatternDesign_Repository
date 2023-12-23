package com.bob.command;

import com.bob.equipments.S0123_AC;
import com.bob.equipments.S0123_Light;

import java.util.List;

public class S0123_ACCommand implements S0123_Command {
    private List<S0123_AC> AcList;

    public S0123_ACCommand(List<S0123_AC> AcList) {
        this.AcList = AcList;
    }


    @Override
    public void execute() {
        for (S0123_AC AC : AcList) {
            AC.turnOn();
        }
    }

    @Override
    public void undo() {
        for (S0123_AC AC : AcList) {
            AC.turnOff();
        }
    }
}
