package a06_command.mineCommandExample.receiver;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Receiver_Door {

  private String location;

  public void open() {
    System.out.printf("Door is opened to the '%s'%n", location);
  }

  public void close() {
    System.out.printf("Door is closed to the '%s'%n", location);
  }
}
