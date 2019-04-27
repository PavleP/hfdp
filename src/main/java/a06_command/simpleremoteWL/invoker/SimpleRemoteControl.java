package a06_command.simpleremoteWL.invoker;

import a06_command.simpleremoteWL.command.Command;

//
// This is the invoker
//
public class SimpleRemoteControl {

  private Command slot;

  public SimpleRemoteControl() {
  }

  public void setCommand(Command command) {
    slot = command;
  }

  public void buttonWasPressed() {
    slot.execute();
  }
}
