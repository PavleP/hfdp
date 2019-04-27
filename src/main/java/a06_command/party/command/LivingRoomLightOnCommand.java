package a06_command.party.command;

import a06_command.party.receiver.Light;

public class LivingRoomLightOnCommand implements Command {

  private Light light;

  public LivingRoomLightOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.on();
  }

  public void undo() {
    light.off();
  }
}
