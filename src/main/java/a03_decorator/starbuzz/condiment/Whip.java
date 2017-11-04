package a03_decorator.starbuzz.condiment;

import a03_decorator.starbuzz.Beverage;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
    super(beverage);
	}
 
	@Override
	public String getDescription() {
		return getBeverage().getDescription() + ", Whip";
	}

	@Override
	public double getCost() {
		return .10 + getBeverage().getCost();
	}
}
