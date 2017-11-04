package a03_decorator.starbuzzWithSizes.condiment;

import a03_decorator.starbuzzWithSizes.Beverage;
import a03_decorator.starbuzzWithSizes.Size;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
	  super(beverage);
	}

	public String getDescription() {
		return getBeverage().getDescription() + ", Milk";
	}

	public double getCost() {
    double cost = getBeverage().getCost();
    Size size = getSize();
    switch (size) {
      case TALL:
        cost += .5;
        break;
      case GRANDE:
        cost += .10;
        break;
      case VENTI:
        cost += .15;
        break;
    }
    return cost;
	}
}
