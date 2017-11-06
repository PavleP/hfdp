package a04_factory.f2_factorymethod.pizzastore;

import a04_factory.f2_factorymethod.pizza.Pizza;
import a04_factory.f2_factorymethod.pizza.PizzaType;

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
