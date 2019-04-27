package a06_command.undo.command;

import a06_command.undo.receiver.Light;

public class DimmerLightOnCommand implements Command {

  private Light light;
  private int prevLevel;

  public DimmerLightOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    prevLevel = light.getLevel();
    light.dim(75);
  }

  public void undo() {
    light.dim(prevLevel);
  }
}
