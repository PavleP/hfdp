package a03_decorator.starbuzz.condiment;

import a03_decorator.starbuzz.Beverage;

public abstract class CondimentDecorator implements Beverage {

  private Beverage beverage;

  public CondimentDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  public Beverage getBeverage() {
    return beverage;
  }

}
