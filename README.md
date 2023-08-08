**Examples Commands:**

1. add_interface_device(“Google Home”, “Living Room”, “OK Google’”)->Added
2. add_interface_device(“Alexa”,”Drawing Room”, “Alexa’”)->Added
3. add_interface_device(“Alexa”,”Kitchen”, “Alexa’”)->Added
4. add_smarthome_device(”Alexa”,“Light”,”Drawing Room”)->Added
5. add_smarthome_device(”Alexa”,“Light”,”Kitchen”)->Added
6. add_smarthome_device(“OK Google”,“Fan“,“Living Room”)->Added
7. add_smarthome_device(”Alexa”,“Smart Charger”, null,)->Added
8. add_smarthome_device(”Alexa”,“Chimney”,”Kitchen”)->Added
9. give_command(“Alexa”,“Light”,”Drawing Room”,”ON”) -> OK, Drawing Room Light
   Turned On
10. give_command(“Alexa”,”Light”,”Drawing Room”,”Black”) -> Sorry, Drawing Room Light
    can not be set to Black.
11. give_command(“Alexa”,”RGB Light”,” Drawing Room”,”ON”) -> Sorry, Drawing Room
    RGB Light Not found
12. give_command(“OK Google”,“Fan”,”Living Room”,”ON”) -> OK, Living Room Fan turned
    on
13. give_command(“OK Google”,“Fan”,”Living Room”,”5”) -> OK, Living Room Fan speed
    set to 5
14. give_command(“OK Google”,“Fan”,”Living Room”,”7”) -> Sorry, Cannot set Living Room
    Fan speed to 7 (outside the predefined range of 1 - 5)
15. give_command(“Alexa”,”Light”,”Drawing Room”,”8”) -> OK, Drawing Room Light
    Brightness set to 8
16. give_command(“Alexa”,“Light”,”Kitchen”,”ON”) -> OK, Kitchen Light Turned On
17. give_command(“Alexa”,”Light”,”Kitchen”,”White”) -> Ok, Kitchen Light is set to White
18. give_command(“Alexa”,“Chimney”,”Kitchen”,”ON”) -> OK, Kitchen Chimney Turned On
19. give_command(“Alexa”,”Smart Charger”,null,”ON”) -> OK, Smart Charger turned on
20. give_command(“Alexa”,”Smart Charger”,null,”OFF”) -> OK, Smart Charger turned off
21. give_command(“Alexa”,“Light”,”Kitchen”,”OFF”) -> OK, Kitchen Light Turned Off
22. give_command(“OK Google”,”Fan”,”Living Room”,”OFF”) -> OK, Living Room Fan
    turned off
23. give_command(“OK Google”,”Fan”,”Living Room”,”3”) -> Sorry, Living Room Fan is not
    turned on
24. print_connected_device(“Alexa”,”Drawing Room”)
    1 Drawing Room Light ON
    2 Smart Charger OFF
25. print_connected_device(“Alexa”,”Kitchen”)
    1 Chimney ON
    2 Light OFF
26. disconnect_smarthome_device(“Alexa”, “Kitchen”, “Chimney”) -> OK, Kitchen Chimney disconnected
27. give_special_command(“OK Google”,”I am home”) -> OK, Switching on everything

- Extensibility
- Get more smart home device added
- Like TV
- Can be turned on and off
- Volume can be changed between a level of 1 to 50 if turned on
- TV INPUT can be changed [HDMI1, HDMI2, CABLE]