package a06_command.party.command;

import a06_command.party.receiver.TV;

public class TVOnCommand implements Command {

  private TV tv;

  public TVOnCommand(TV tv) {
    this.tv = tv;
  }

  public void execute() {
    tv.on();
    tv.setInputChannel();
  }

  public void undo() {
    tv.off();
  }
}
