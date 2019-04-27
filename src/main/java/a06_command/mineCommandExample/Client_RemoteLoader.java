package a06_command.mineCommandExample;

import a06_command.mineCommandExample.command.Command_DoorClose;
import a06_command.mineCommandExample.command.Command_DoorOpen;
import a06_command.mineCommandExample.command.Command_LightOff;
import a06_command.mineCommandExample.command.Command_LightOn;
import a06_command.mineCommandExample.receiver.Receiver_Door;
import a06_command.mineCommandExample.receiver.Receiver_Light;

public class Client_RemoteLoader {

  public static void main(String[] args) {

    Invoker_RemoteControl invoker_remoteControl = new Invoker_RemoteControl();

    // START - Kitchen light
    Receiver_Light kitchenLight = new Receiver_Light("kitchen");
    invoker_remoteControl.setButtonOneCommand(new Command_LightOn(kitchenLight));
    invoker_remoteControl.setButtonTwoCommand(new Command_LightOff(kitchenLight));

    System.out.println(invoker_remoteControl.toString());

    invoker_remoteControl.pressButtonOne();
    invoker_remoteControl.pressButtonTwo();
    // END - Kitchen light

    // START - Garage door
    Receiver_Door garageDoor = new Receiver_Door("garage");
    invoker_remoteControl.setButtonOneCommand(new Command_DoorOpen(garageDoor));
    invoker_remoteControl.setButtonTwoCommand(new Command_DoorClose(garageDoor));

    System.out.println(invoker_remoteControl.toString());

    invoker_remoteControl.pressButtonTwo();
    invoker_remoteControl.pressButtonTwo();
    // END - Garage door

    // START - Room light with lambda
    Receiver_Light roomLight = new Receiver_Light("room");
    invoker_remoteControl.setButtonOneCommand(roomLight::on);
    invoker_remoteControl.setButtonTwoCommand(roomLight::off);

    System.out.println(invoker_remoteControl.toString());

    invoker_remoteControl.pressButtonTwo();
    invoker_remoteControl.pressButtonTwo();
    // END - Room light with lambda



  }
}
