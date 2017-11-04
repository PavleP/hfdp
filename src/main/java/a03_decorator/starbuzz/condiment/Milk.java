package a03_decorator.starbuzz.condiment;

import a03_decorator.starbuzz.Beverage;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return getBeverage().getDescription() + ", Milk";
	}

	@Override
	public double getCost() {
		return .10 + getBeverage().getCost();
	}
}
