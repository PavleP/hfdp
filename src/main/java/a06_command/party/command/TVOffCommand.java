package a06_command.party.command;

import a06_command.party.receiver.TV;

public class TVOffCommand implements Command {

  private TV tv;

  public TVOffCommand(TV tv) {
    this.tv = tv;
  }

  public void execute() {
    tv.off();
  }

  public void undo() {
    tv.on();
  }
}
