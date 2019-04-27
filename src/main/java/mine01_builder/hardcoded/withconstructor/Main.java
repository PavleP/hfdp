package mine01_builder.hardcoded.withconstructor;

public class Main {

  public static void main(String[] args) {
    Details details = new Details
        .Builder(2, 5)
        .var4(4)
        .build();
    System.out.println(details);
  }

}
