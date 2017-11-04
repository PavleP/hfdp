package a03_decorator.starbuzz.coffee;

import a03_decorator.starbuzz.Beverage;

public class DarkRoast implements Beverage {

  @Override
  public String getDescription() {
    return "Dark Roast Coffee";
  }

  @Override
	public double getCost() {
		return .99;
	}
}

