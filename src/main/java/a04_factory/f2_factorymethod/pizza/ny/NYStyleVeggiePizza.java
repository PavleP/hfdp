package a04_factory.f2_factorymethod.pizza.ny;

import com.google.common.collect.Lists;

import a04_factory.f2_factorymethod.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza() {
	  setName("NY Style Veggie Pizza");
	  setDough("Thin Crust Dough");
	  setSauce("Marinara Sauce");
	  setToppings(Lists.newArrayList("Grated Reggiano Cheese", "Garlic", "Onion", 	"Mushrooms", "Red Pepper"));
	}
}
