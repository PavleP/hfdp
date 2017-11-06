package a04_factory.f1_simplefactory;

import a04_factory.f1_simplefactory.pizza.CheesePizza;
import a04_factory.f1_simplefactory.pizza.ClamPizza;
import a04_factory.f1_simplefactory.pizza.PepperoniPizza;
import a04_factory.f1_simplefactory.pizza.Pizza;
import a04_factory.f1_simplefactory.pizza.PizzaType;
import a04_factory.f1_simplefactory.pizza.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(PizzaType type) {

    switch (type) {
      case CHEESE:
        return new CheesePizza();
      case PEPPERONI:
        return new PepperoniPizza();
      case CLAM:
        return new ClamPizza();
      case VEGGIE:
        return new VeggiePizza();
      default:
        throw new IllegalArgumentException("Piza type " + type + " is not supported");
    }
	}
}
