package a03_decorator.starbuzz.condiment;

import a03_decorator.starbuzz.Beverage;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
    super(beverage);
	}

	@Override
	public String getDescription() {
		return getBeverage().getDescription() + ", Soy";
	}

	@Override
	public double getCost() {
		return .15 + getBeverage().getCost();
	}
}
