package a06_command.remote.command;

import a06_command.remote.receiver.GarageDoor;

public class GarageDoorUpCommand implements Command {

  private GarageDoor garageDoor;

  public GarageDoorUpCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  public void execute() {
    garageDoor.up();
  }
}
