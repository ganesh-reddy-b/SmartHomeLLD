package com.home.command;

public class Invoker {

    public void invoke(Command command) {
        command.execute();
    }

}
