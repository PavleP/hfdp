package a06_command.mineCommandExample.command;

import a06_command.mineCommandExample.receiver.Receiver_Light;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Command_LightOff implements Command {

  private Receiver_Light light;

  @Override
  public void execute() {
    light.off();
  }
}
