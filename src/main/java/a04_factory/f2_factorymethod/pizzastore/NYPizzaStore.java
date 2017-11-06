package a04_factory.f2_factorymethod.pizzastore;

import a04_factory.f2_factorymethod.pizza.PizzaType;
import a04_factory.f2_factorymethod.pizza.ny.NYStyleCheesePizza;
import a04_factory.f2_factorymethod.pizza.ny.NYStyleClamPizza;
import a04_factory.f2_factorymethod.pizza.ny.NYStylePepperoniPizza;
import a04_factory.f2_factorymethod.pizza.ny.NYStyleVeggiePizza;
import a04_factory.f2_factorymethod.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

  protected Pizza createPizza(PizzaType type) {
    switch (type) {
      case CHEESE:
        return new NYStyleCheesePizza();
      case PEPPERONI:
        return new NYStylePepperoniPizza();
      case CLAM:
        return new NYStyleClamPizza();
      case VEGGIE:
        return new NYStyleVeggiePizza();
      default:
        throw new IllegalArgumentException("Pizza type " + type + " is not supported");
    }
	}
}
