package mine01_builder.withlombok;

public class Main {

  public static void main(String[] args) {
    LombokDetails lombokDetails = LombokDetails.builder().var1(2).var4(7).build();
    System.out.println(lombokDetails);
  }

}
