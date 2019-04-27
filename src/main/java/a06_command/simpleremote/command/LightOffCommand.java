package a06_command.simpleremote.command;

import a06_command.simpleremote.receiver.Light;

public class LightOffCommand implements Command {

  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.off();
  }
}
