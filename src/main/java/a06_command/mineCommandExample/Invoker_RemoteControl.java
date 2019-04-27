package a06_command.mineCommandExample;

import a06_command.mineCommandExample.command.Command;
import a06_command.mineCommandExample.command.Command_Default;
import lombok.Setter;

/**
 * Remote control with only two buttons.
 */
@Setter
public class Invoker_RemoteControl {

  private Command buttonOneCommand = new Command_Default();
  private Command buttonTwoCommand = new Command_Default();

  public void pressButtonOne() {
    buttonOneCommand.execute();
  }

  public void pressButtonTwo() {
    buttonTwoCommand.execute();
  }

  @Override
  public String toString() {

    StringBuilder stringBuilder = new StringBuilder();

    stringBuilder.append(System.lineSeparator());

    stringBuilder.append("Command assigned to the button one: ");
    stringBuilder.append(buttonOneCommand.getClass().getSimpleName());
    stringBuilder.append(System.lineSeparator());

    stringBuilder.append("Command assigned to the button two: ");
    stringBuilder.append(buttonTwoCommand.getClass().getSimpleName());
    stringBuilder.append(System.lineSeparator());

    return stringBuilder.toString();
  }
}
