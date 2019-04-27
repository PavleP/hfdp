package a06_command.party.command;

import a06_command.party.receiver.Light;

public class LightOffCommand implements Command {

  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.off();
  }

  public void undo() {
    light.on();
  }
}
