package a04_factory.f3_abstractfactory.pizzastore;

import a04_factory.f3_abstractfactory.ingredientfactory.ChicagoPizzaIngredientFactory;
import a04_factory.f3_abstractfactory.ingredientfactory.PizzaIngredientFactory;
import a04_factory.f3_abstractfactory.pizza.CheesePizza;
import a04_factory.f3_abstractfactory.pizza.ClamPizza;
import a04_factory.f3_abstractfactory.pizza.PepperoniPizza;
import a04_factory.f3_abstractfactory.pizza.Pizza;
import a04_factory.f3_abstractfactory.pizza.PizzaType;
import a04_factory.f3_abstractfactory.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(PizzaType type) {
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    Pizza pizza;
    switch (type) {
      case CHEESE:
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("Chicago Style Cheese Pizza");
        return pizza;
      case PEPPERONI:
        pizza = new PepperoniPizza(ingredientFactory);
        pizza.setName("Chicago Style Pepperoni Pizza");
        return pizza;
      case CLAM:
        pizza = new ClamPizza(ingredientFactory);
        pizza.setName("Chicago Style Clam Pizza");
        return pizza;
      case VEGGIE:
        pizza = new VeggiePizza(ingredientFactory);
        pizza.setName("Chicago Style Veggie Pizza");
        return pizza;
      default:
        throw new IllegalArgumentException("Pizza type " + type + " is not supported");
    }
	}
}
