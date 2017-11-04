package a03_decorator.starbuzzWithSizes.condiment;

import a03_decorator.starbuzzWithSizes.Beverage;
import a03_decorator.starbuzzWithSizes.Size;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		return getBeverage().getDescription() + ", Whip";
	}
 
	public double getCost() {
    double cost = getBeverage().getCost();
    Size size = getSize();
    switch (size) {
      case TALL:
        cost += .15;
        break;
      case GRANDE:
        cost += .20;
        break;
      case VENTI:
        cost += .25;
        break;
    }
    return cost;
	}
}
