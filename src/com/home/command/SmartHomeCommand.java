package com.home.command;

import com.home.smartHomeDevice.SmartHomeDevice;

public abstract class SmartHomeCommand implements Command {
    SmartHomeDevice smartHomeDevice;
    String commandString;

    public SmartHomeCommand(SmartHomeDevice smartHomeDevice, String commandString) {
        this.commandString = commandString;
        this.smartHomeDevice = smartHomeDevice;
    }

    public SmartHomeCommand(SmartHomeDevice device) {
        this.smartHomeDevice = device;
    }
}
