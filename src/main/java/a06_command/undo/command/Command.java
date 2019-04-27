package a06_command.undo.command;

public interface Command {
  void execute();
  void undo();
}
