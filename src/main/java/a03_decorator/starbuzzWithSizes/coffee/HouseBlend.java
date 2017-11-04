package a03_decorator.starbuzzWithSizes.coffee;

import a03_decorator.starbuzzWithSizes.Beverage;

public class HouseBlend extends Beverage {

  @Override
  public String getDescription() {
    return "House Blend Coffee";
  }

  @Override
  public double getCost() {
		return .89;
	}
}

