package a03_decorator.starbuzzWithSizes.condiment;

import a03_decorator.starbuzzWithSizes.Beverage;
import a03_decorator.starbuzzWithSizes.Size;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return getBeverage().getDescription() + ", Soy";
	}

	public double getCost() {
		double cost = getBeverage().getCost();
    Size size = getSize();
    switch (size) {
      case TALL:
        cost += .10;
        break;
      case GRANDE:
        cost += .15;
        break;
      case VENTI:
        cost += .20;
        break;
    }
		return cost;
	}
}
