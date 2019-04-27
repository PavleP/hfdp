package a06_command.party.command;

import a06_command.party.receiver.Hottub;

public class HottubOnCommand implements Command {

  private Hottub hottub;

  public HottubOnCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  public void execute() {
    hottub.on();
    hottub.setTemperature(104);
    hottub.circulate();
  }

  public void undo() {
    hottub.off();
  }
}
