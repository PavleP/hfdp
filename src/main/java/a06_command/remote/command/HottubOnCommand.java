package a06_command.remote.command;

import a06_command.remote.receiver.Hottub;

public class HottubOnCommand implements Command {

  private Hottub hottub;

  public HottubOnCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  public void execute() {
    hottub.on();
    hottub.heat();
    hottub.bubblesOn();
  }
}
