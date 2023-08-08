package com.home;

import com.home.command.Command;
import com.home.command.CommandFactory;
import com.home.command.Invoker;
import com.home.exception.ExistingInterfaceDeviceException;
import com.home.exception.InvalidCommandException;
import com.home.exception.NonExistingInterfaceDeviceException;
import com.home.exception.UnknownCommandException;
import com.home.interfaceDevice.InterfaceDevice;
import com.home.interfaceDevice.InterfaceDeviceFactory;
import com.home.smartHomeDevice.SmartHomeDevice;
import com.home.smartHomeDevice.SmartHomeFactory;

public class InterfaceDeviceController {

    Invoker invoker = new Invoker();
    SmartHomeFactory smartHomeFactory = new SmartHomeFactory();
    CommandFactory commandFactory = new CommandFactory();
    InterfaceDeviceFactory interfaceDeviceFactory = new InterfaceDeviceFactory();

    public void add_interface_device(String interfaceName, String location, String activationKey) {
        try {
            interfaceDeviceFactory.createInterfaceDevice(interfaceName, location, activationKey);
        } catch (ExistingInterfaceDeviceException e) {
            System.out.println(e.getMessage());
        }
    }

    public void add_smarthome_device(String activationKey, String name, String location) {
        SmartHomeDevice smartHomeDevice = smartHomeFactory.getSmartHomeDevice(name, location);
        if (activationKey == null) {
            System.out.println(smartHomeDevice);
            return;
        }
        InterfaceDevice device = null;
        try {
            device = interfaceDeviceFactory.getInterfaceDevice(activationKey);
        } catch (NonExistingInterfaceDeviceException e) {
            throw new RuntimeException(e);
        }
        assert device != null;
        device.connectSmartDevice(smartHomeDevice);
        System.out.println(smartHomeDevice);
        return;
    }

    public void connect_smarthome_device(String activationKey, String name, String location) {
        InterfaceDevice device = null;
        try {
            device = interfaceDeviceFactory.getInterfaceDevice(activationKey);
        } catch (NonExistingInterfaceDeviceException e) {
            System.out.println(e.getMessage());
        }
        SmartHomeDevice smartHomeDevice = smartHomeFactory.getSmartHomeDevice(name, location);
        device.connectSmartDevice(smartHomeDevice);
        System.out.println(device);
    }

    public void give_command(String activationKey, String name, String location, String commandString) {
        InterfaceDevice device = null;
        try {
            device = interfaceDeviceFactory.getInterfaceDevice(activationKey);
        } catch (NonExistingInterfaceDeviceException e) {
            System.out.println(e.getMessage());
        }
        SmartHomeDevice smartHomeDevice = smartHomeFactory.getSmartHomeDevice(name, location);
        if (!device.getConnectedSmartDevices().contains(smartHomeDevice)) {
            System.out.println("Smart device is not connected to interfaceDevice");
            return;
        }
        Command command = null;
        try {
            command = commandFactory.getCommand(smartHomeDevice, commandString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        invoker.invoke(command);
        System.out.println(smartHomeDevice);
    }
}
