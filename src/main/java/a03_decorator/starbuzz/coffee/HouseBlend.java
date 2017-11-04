package a03_decorator.starbuzz.coffee;

import a03_decorator.starbuzz.Beverage;

public class HouseBlend implements Beverage {

  @Override
  public String getDescription() {
    return "House Blend Coffee";
  }

  @Override
	public double getCost() {
		return .89;
	}
}

