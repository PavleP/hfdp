package a03_decorator.starbuzz.coffee;

import a03_decorator.starbuzz.Beverage;

public class Decaf implements Beverage {

  @Override
  public String getDescription() {
    return "Decaf Coffee";
  }

  @Override
	public double getCost() {
		return 1.05;
	}
}

