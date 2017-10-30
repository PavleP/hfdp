package strategy.duck;

import strategy.flybehavior.FlyNoWay;
import strategy.flybehavior.FlyWithWings;
import strategy.quackbehavior.Quack;
import strategy.quackbehavior.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		super(new FlyNoWay(), new Squeak());
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
