package a06_command.simpleremote.client;

import a06_command.simpleremote.command.GarageDoorOpenCommand;
import a06_command.simpleremote.command.LightOnCommand;
import a06_command.simpleremote.invoker.SimpleRemoteControl;
import a06_command.simpleremote.receiver.GarageDoor;
import a06_command.simpleremote.receiver.Light;

public class RemoteControlTest {
  public static void main(String[] args) {

    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();
    GarageDoor garageDoor = new GarageDoor();
    LightOnCommand lightOn = new LightOnCommand(light);
    GarageDoorOpenCommand garageOpen =
        new GarageDoorOpenCommand(garageDoor);

    remote.setCommand(lightOn);
    remote.buttonWasPressed();
    remote.setCommand(garageOpen);
    remote.buttonWasPressed();
  }

}
