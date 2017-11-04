package a03_decorator.starbuzzWithSizes.condiment;

import a03_decorator.starbuzzWithSizes.Beverage;
import a03_decorator.starbuzzWithSizes.Size;

public abstract class CondimentDecorator extends Beverage {

  private Beverage beverage;

  public CondimentDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  public Beverage getBeverage() {
    return beverage;
  }

	@Override
  public Size getSize() {
		return beverage.getSize();
	}
}
