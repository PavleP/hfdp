package mine01_builder.hardcoded.withconstructor;

public class Details {

  private int var1; // required
  private int var2; // required
  private int var3; // optional
  private int var4; // optional
  private int var5; // optional

  public static class Builder {

    private int var1;
    private int var2;

    private int var3 = 0;
    private int var4 = 0;
    private int var5 = 0;

    public Builder(int var1, int var2) {
      this.var1 = var1;
      this.var2 = var2;
    }

    public Builder var3(int var3) {
      this.var3 = var3;
      return this;
    }

    public Builder var4(int var4) {
      this.var4 = var4;
      return this;
    }

    public Builder var5(int var5) {
      this.var5 = var5;
      return this;
    }

    public Details build() {
      return new Details(this);
    }
  }

  private Details(Builder builder) {
    this.var1 = builder.var1;
    this.var2 = builder.var2;
    this.var3 = builder.var3;
    this.var4 = builder.var4;
    this.var5 = builder.var5;
  }
}
