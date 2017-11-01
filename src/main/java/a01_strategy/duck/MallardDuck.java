package a01_strategy.duck;

import a01_strategy.flybehavior.FlyWithWings;
import a01_strategy.quackbehavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super(new FlyWithWings(), new Quack());
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
