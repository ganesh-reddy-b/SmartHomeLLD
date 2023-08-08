package com.home.command;

import com.home.smartHomeDevice.GenericElectricDevice;

public class OffCommand extends SmartHomeCommand {
    public OffCommand(GenericElectricDevice device) {
        super(device);
    }

    @Override
    public void execute() {
        System.out.println("----------------------------------------------");
        GenericElectricDevice device = (GenericElectricDevice) smartHomeDevice;
        device.setOnOffStatus(Boolean.FALSE);
        System.out.println(device);
        System.out.println("----------------------------------------------");
    }
}
