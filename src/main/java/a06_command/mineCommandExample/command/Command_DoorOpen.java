package a06_command.mineCommandExample.command;

import a06_command.mineCommandExample.receiver.Receiver_Door;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Command_DoorOpen implements Command {

  private Receiver_Door door;

  @Override
  public void execute() {
    door.open();
  }
}
