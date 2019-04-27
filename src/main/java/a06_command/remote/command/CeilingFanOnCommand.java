package a06_command.remote.command;

import a06_command.remote.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {

  private CeilingFan ceilingFan;

  public CeilingFanOnCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  public void execute() {
    ceilingFan.high();
  }
}
