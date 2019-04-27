package a06_command.remote.command;

import a06_command.remote.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {

  private CeilingFan ceilingFan;

  public CeilingFanOffCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  public void execute() {
    ceilingFan.off();
  }
}
