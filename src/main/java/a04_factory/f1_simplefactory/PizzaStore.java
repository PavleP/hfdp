package a04_factory.f1_simplefactory;

import a04_factory.f1_simplefactory.pizza.Pizza;
import a04_factory.f1_simplefactory.pizza.PizzaType;

public class PizzaStore {

	private SimplePizzaFactory factory;
 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(PizzaType type) {
		Pizza pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
