package a06_command.remote.command;

import a06_command.remote.receiver.Light;

public class LightOffCommand implements Command {

  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.off();
  }
}
