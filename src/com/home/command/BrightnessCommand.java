package com.home.command;

import com.home.exception.NotPossibleBrigtnessException;
import com.home.smartHomeDevice.Light;
import com.home.smartHomeDevice.SmartHomeDevice;

public class BrightnessCommand extends SmartHomeCommand {
    public BrightnessCommand(Light smartHomeDevice, String commandString) {
        super(smartHomeDevice, commandString);
    }

    @Override
    public void execute() {
        System.out.println("----------------------------------------------");
        Light light = (Light) smartHomeDevice;
        try {
            light.setBrightness(Integer.valueOf(commandString));
        } catch (NotPossibleBrigtnessException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(light);
        System.out.println("----------------------------------------------");
    }
}
