package a06_command.remote.command;

import a06_command.remote.receiver.Stereo;

public class StereoOffCommand implements Command {

  private Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.off();
  }
}
