package mine01_builder.hardcoded.withstaticfactorymethod;

public class Main {

  public static void main(String[] args) {
    Datails datails = Datails
        .builder(2, 5)
        .var4(4)
        .build();
    System.out.println(datails);
  }

}
