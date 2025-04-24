package com.carlos.Invokers;

import com.carlos.Commands.OrderCommand;

public class CommandInvoker {
    private OrderCommand lastCommand;

    public void setCommand(OrderCommand command) {
        this.lastCommand = command;
    }

    public void executeCommand() {
        if (lastCommand != null) {
            lastCommand.execute();
        }
    }

    public void undoLastCommand() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}