package a06_command.remote.command;

import a06_command.remote.receiver.GarageDoor;

public class GarageDoorDownCommand implements Command {

  private GarageDoor garageDoor;

  public GarageDoorDownCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  public void execute() {
    garageDoor.up();
  }
}
