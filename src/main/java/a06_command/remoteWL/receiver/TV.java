package a06_command.remoteWL.receiver;

public class TV {

  private String location;
  private int channel;

  public TV(String location) {
    this.location = location;
  }

  public void on() {
    System.out.println("TV is on");
  }

  public void off() {
    System.out.println("TV is off");
  }

  public void setInputChannel() {
    this.channel = 3;
    System.out.println("Channel is set for VCR");
  }
}
