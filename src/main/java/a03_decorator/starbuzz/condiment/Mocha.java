package a03_decorator.starbuzz.condiment;

import a03_decorator.starbuzz.Beverage;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
    super(beverage);
	}
 
	@Override
	public String getDescription() {
		return getBeverage().getDescription() + ", Mocha";
	}

	@Override
	public double getCost() {
		return .20 + getBeverage().getCost();
	}
}
