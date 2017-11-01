package a01_strategy.duck;

import a01_strategy.flybehavior.FlyNoWay;
import a01_strategy.quackbehavior.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		super(new FlyNoWay(), new Squeak());
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
