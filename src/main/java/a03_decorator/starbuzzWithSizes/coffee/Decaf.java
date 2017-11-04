package a03_decorator.starbuzzWithSizes.coffee;

import a03_decorator.starbuzzWithSizes.Beverage;

public class Decaf extends Beverage {

  @Override
  public String getDescription() {
    return "Decaf Coffee";
  }

  @Override
  public double getCost() {
		return 1.05;
	}
}

