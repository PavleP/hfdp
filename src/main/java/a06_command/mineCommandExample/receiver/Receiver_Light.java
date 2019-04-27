package a06_command.mineCommandExample.receiver;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Receiver_Light {

  private String location;

  public void on() {
    System.out.printf("Light is turned on at '%s'%n", location);
  }

  public void off() {
    System.out.printf("Light is turned off at '%s'%n", location);
  }
}
