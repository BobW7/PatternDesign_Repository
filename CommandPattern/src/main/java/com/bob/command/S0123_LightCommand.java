package com.bob.command;

import com.bob.equipments.S0123_Light;

import java.util.List;

public class S0123_LightCommand implements S0123_Command {
    private List<S0123_Light> lights;

    public S0123_LightCommand(List<S0123_Light> lights) {
        this.lights = lights;
    }


    @Override
    public void execute() {
        for (S0123_Light light : lights) {
            light.turnOn();
        }
    }

    @Override
    public void undo() {
        for (S0123_Light light : lights) {
            light.turnOff();
        }
    }
}
