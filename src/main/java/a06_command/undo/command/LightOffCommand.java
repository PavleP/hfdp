package a06_command.undo.command;

import a06_command.undo.receiver.Light;

public class LightOffCommand implements Command {

  private Light light;
  private int level;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    level = light.getLevel();
    light.off();
  }

  public void undo() {
    light.dim(level);
  }
}
