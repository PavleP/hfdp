package strategy.duck;

import strategy.flybehavior.FlyNoWay;
import strategy.quackbehavior.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		super(new FlyNoWay(), new MuteQuack());
	}

	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
