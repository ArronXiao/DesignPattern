package com.arron.pattern.command;

import java.util.ArrayList;

public class Invoker {

    ArrayList<BaseCommand> baseCommands = new ArrayList<>();
    
    public void addCommand(BaseCommand baseCommand) {
        baseCommands.add(baseCommand);
    }
    
    public void ExcuteCommand() {
        for(BaseCommand command: baseCommands) {
            command.execute();
        }
    }
}
