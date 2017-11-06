package a04_factory.f2_factorymethod.pizzastore;

import a04_factory.f2_factorymethod.pizza.PizzaType;
import a04_factory.f2_factorymethod.pizza.chicago.ChicagoStyleCheesePizza;
import a04_factory.f2_factorymethod.pizza.chicago.ChicagoStyleClamPizza;
import a04_factory.f2_factorymethod.pizza.chicago.ChicagoStylePepperoniPizza;
import a04_factory.f2_factorymethod.pizza.chicago.ChicagoStyleVeggiePizza;
import a04_factory.f2_factorymethod.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

  protected Pizza createPizza(PizzaType type) {
    switch (type) {
      case CHEESE:
        return new ChicagoStyleCheesePizza();
      case PEPPERONI:
        return new ChicagoStylePepperoniPizza();
      case CLAM:
        return new ChicagoStyleClamPizza();
      case VEGGIE:
        return new ChicagoStyleVeggiePizza();
      default:
        throw new IllegalArgumentException("Pizza type " + type + " is not supported");
    }
	}
}
