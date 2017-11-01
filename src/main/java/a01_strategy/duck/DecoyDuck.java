package a01_strategy.duck;

import a01_strategy.flybehavior.FlyNoWay;
import a01_strategy.quackbehavior.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		super(new FlyNoWay(), new MuteQuack());
	}

	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
