package a06_command.party.command;

import a06_command.party.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {

  private Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.on();
    stereo.setCD();
    stereo.setVolume(11);
  }

  public void undo() {
    stereo.off();
  }
}
