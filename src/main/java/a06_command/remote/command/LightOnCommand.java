package a06_command.remote.command;

import a06_command.remote.receiver.Light;

public class LightOnCommand implements Command {

  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.on();
  }
}
