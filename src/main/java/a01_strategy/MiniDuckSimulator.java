package a01_strategy;

import a01_strategy.duck.DecoyDuck;
import a01_strategy.duck.Duck;
import a01_strategy.duck.MallardDuck;
import a01_strategy.duck.ModelDuck;
import a01_strategy.flybehavior.FlyRocketPowered;
import a01_strategy.duck.RubberDuck;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		Duck rubberDuckie = new RubberDuck();
		Duck decoy = new DecoyDuck();
		Duck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
		model.performFly();

		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
