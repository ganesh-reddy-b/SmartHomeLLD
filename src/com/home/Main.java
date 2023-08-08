package com.home;

import com.home.exception.NonExistingInterfaceDeviceException;
import com.home.interfaceDevice.InterfaceDeviceFactory;

public class Main {
    public static void main(String[] args) throws NonExistingInterfaceDeviceException {
        InterfaceDeviceController interfaceDeviceController = new InterfaceDeviceController();
        interfaceDeviceController.add_interface_device("Google Home", "Living Room", "OK Google");
        interfaceDeviceController.add_interface_device("Alexa","Drawing Room", "Alexa");
        interfaceDeviceController.add_smarthome_device("Alexa","Light","Drawing Room");
        interfaceDeviceController.add_smarthome_device(null,"Smart Charger", null);
        interfaceDeviceController.connect_smarthome_device("Alexa", "Smart Charger", null);
        interfaceDeviceController.give_command("Alexa","Light","Drawing Room","ON");
        interfaceDeviceController.give_command("Alexa","Light","Drawing Room","OFF");
    }
}
