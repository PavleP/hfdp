package a06_command.remote.command;

import a06_command.remote.receiver.Hottub;

public class HottubOffCommand implements Command {

  private Hottub hottub;

  public HottubOffCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  public void execute() {
    hottub.cool();
    hottub.off();
  }
}
