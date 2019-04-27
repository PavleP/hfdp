package a06_command.remote.command;

import a06_command.remote.receiver.Stereo;

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
}
