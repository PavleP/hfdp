package strategy.duck;

import strategy.flybehavior.FlyNoWay;
import strategy.quackbehavior.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		super(new FlyNoWay(), new Quack());
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
