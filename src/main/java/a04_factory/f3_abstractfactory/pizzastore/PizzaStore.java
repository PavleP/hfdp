package a04_factory.f3_abstractfactory.pizzastore;

import a04_factory.f3_abstractfactory.pizza.Pizza;
import a04_factory.f3_abstractfactory.pizza.PizzaType;

public abstract class PizzaStore {

  public Pizza orderPizza(PizzaType type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

  protected abstract Pizza createPizza(PizzaType type);
}
