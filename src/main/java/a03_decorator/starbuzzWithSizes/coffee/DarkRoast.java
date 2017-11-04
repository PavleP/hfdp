package a03_decorator.starbuzzWithSizes.coffee;

import a03_decorator.starbuzzWithSizes.Beverage;

public class DarkRoast extends Beverage {

  @Override
  public String getDescription() {
    return "Dark Roast Coffee";
  }

  @Override
  public double getCost() {
		return .99;
	}
}

