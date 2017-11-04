package a03_decorator.starbuzzWithSizes.coffee;

import a03_decorator.starbuzzWithSizes.Beverage;

public class Espresso extends Beverage {
  
  @Override
  public String getDescription() {
    return "Espresso";
  }

  @Override
  public double getCost() {
		return 1.99;
	}
}

