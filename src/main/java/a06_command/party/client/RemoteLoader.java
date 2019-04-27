package a06_command.party.client;

import a06_command.party.receiver.Light;
import a06_command.party.receiver.Stereo;
import a06_command.party.command.StereoOffCommand;
import a06_command.party.command.StereoOnCommand;
import a06_command.party.receiver.TV;
import a06_command.party.command.TVOffCommand;
import a06_command.party.command.TVOnCommand;
import a06_command.party.command.Command;
import a06_command.party.command.HottubOffCommand;
import a06_command.party.command.HottubOnCommand;
import a06_command.party.command.LightOffCommand;
import a06_command.party.command.LightOnCommand;
import a06_command.party.command.MacroCommand;
import a06_command.party.invoker.RemoteControl;
import a06_command.party.receiver.Hottub;

public class RemoteLoader {

  public static void main(String[] args) {

    RemoteControl remoteControl = new RemoteControl();

    Light light = new Light("Living Room");
    TV tv = new TV("Living Room");
    Stereo stereo = new Stereo("Living Room");
    Hottub hottub = new Hottub();

    LightOnCommand lightOn = new LightOnCommand(light);
    StereoOnCommand stereoOn = new StereoOnCommand(stereo);
    TVOnCommand tvOn = new TVOnCommand(tv);
    HottubOnCommand hottubOn = new HottubOnCommand(hottub);
    LightOffCommand lightOff = new LightOffCommand(light);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);
    TVOffCommand tvOff = new TVOffCommand(tv);
    HottubOffCommand hottubOff = new HottubOffCommand(hottub);

    Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
    Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);

    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

    System.out.println(remoteControl);
    System.out.println("--- Pushing Macro On---");
    remoteControl.onButtonWasPushed(0);
    System.out.println("--- Pushing Macro Off---");
    remoteControl.offButtonWasPushed(0);
  }
}
