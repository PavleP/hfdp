package mine01_builder.withlombok;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
public class LombokDetails {

  private int var1; // optional
  private int var2; // optional
  private int var3; // optional
  private int var4; // optional
  private int var5; // optional

  // if we want to have required parameters (i.e. var1 and var2) then we can use
  // https://stackoverflow.com/questions/29885428/required-arguments-with-a-lombok-builder

}
