package mine01_builder.hardcoded.withconstructor;

public class Main {

  public static void main(String[] args) {
    Datails datails = new Datails
        .Builder(2, 5)
        .var4(4)
        .build();
    System.out.println(datails);
  }

}
