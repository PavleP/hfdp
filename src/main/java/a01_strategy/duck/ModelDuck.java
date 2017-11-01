package a01_strategy.duck;

import a01_strategy.flybehavior.FlyNoWay;
import a01_strategy.quackbehavior.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		super(new FlyNoWay(), new Quack());
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
