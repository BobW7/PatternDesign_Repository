package com.bob.invoker;

import com.bob.command.S0123_Command;

import java.util.ArrayList;
import java.util.List;

public class S0123_Invoker {
    private List<S0123_Command> commands = new ArrayList<>();

    public void addCommand(S0123_Command command) {
        commands.add(command);
    }


    public void executeCommands() {
        for (S0123_Command command : commands) {
            command.execute();
        }
        commands.clear();
    }

    public void undoCommands() {
        for (S0123_Command command : commands) {
            command.undo();
        }
        commands.clear();
    }
}
