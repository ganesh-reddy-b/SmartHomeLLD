package com.home.smartHomeDevice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SmartHomeFactory {

    HashMap<String, SmartHomeDevice> smartHomeDeviceSet = new HashMap<>();

    public SmartHomeDevice getSmartHomeDevice(String deviceName, String location) {
        if(location == null)
            location = "";
        String hash = deviceName + " - " + location;
        if(smartHomeDeviceSet.containsKey(hash))
            return smartHomeDeviceSet.get(hash);
        SmartHomeDevice device = null;
        if (deviceName.contains("Fan") || deviceName.contains("fan")) {
            device = new Fan(deviceName, location);
        } else if (deviceName.contains("Light") || deviceName.contains("light")) {
            device = new Light(deviceName, location);
        }
        else
            device = new GenericElectricDevice(deviceName, location);
        smartHomeDeviceSet.put(hash, device);
        return device;
    }


}
