package strategy.duck;

import strategy.flybehavior.FlyWithWings;
import strategy.quackbehavior.Quack;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
    super(new FlyWithWings(), new Quack());
	}

	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
