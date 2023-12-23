package com.bob.command;

import com.bob.equipments.S0123_Multimedia;

import java.util.List;

public class S0123_MultimediaCommand implements S0123_Command {
    private List<S0123_Multimedia> multimediaList;

    public S0123_MultimediaCommand(List<S0123_Multimedia> multimediaList) {
        this.multimediaList = multimediaList;
    }


    @Override
    public void execute() {
        for (S0123_Multimedia multimedia : multimediaList) {
            multimedia.turnOn();
        }
    }

    @Override
    public void undo() {
        for (S0123_Multimedia multimedia : multimediaList) {
            multimedia.turnOff();
        }
    }
}
