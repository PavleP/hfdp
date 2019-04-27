package a06_command.simpleremote.command;

import a06_command.simpleremote.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {

  private GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  public void execute() {
    garageDoor.up();
  }
}
