package a06_command.remote.command;

import a06_command.remote.receiver.Light;

public class LivingRoomLightOnCommand implements Command {

  private Light light = new Light("Living Room");

  public void execute() {
    light.on();
  }
}
