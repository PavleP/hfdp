package a06_command.party.command;

import a06_command.party.receiver.Stereo;

public class StereoOffCommand implements Command {

  private Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.off();
  }

  public void undo() {
    stereo.on();
  }
}
