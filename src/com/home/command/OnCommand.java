package com.home.command;

import com.home.smartHomeDevice.GenericElectricDevice;

public class OnCommand extends SmartHomeCommand {
    public OnCommand(GenericElectricDevice device) {
        super(device);
    }

    @Override
    public void execute() {
        System.out.println("----------------------------------------------");
        GenericElectricDevice device = (GenericElectricDevice) smartHomeDevice;
        device.setOnOffStatus(Boolean.TRUE);
        System.out.println(device);
        System.out.println("----------------------------------------------");
    }
}
