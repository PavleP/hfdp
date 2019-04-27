package a06_command.party.command;

import a06_command.party.receiver.Hottub;

public class HottubOffCommand implements Command {

  private Hottub hottub;

  public HottubOffCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  public void execute() {
    hottub.setTemperature(98);
    hottub.off();
  }

  public void undo() {
    hottub.on();
  }
}
