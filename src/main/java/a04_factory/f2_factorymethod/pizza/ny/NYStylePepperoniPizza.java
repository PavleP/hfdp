package a04_factory.f2_factorymethod.pizza.ny;

import com.google.common.collect.Lists;

import a04_factory.f2_factorymethod.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {

	public NYStylePepperoniPizza() {
	  setName("NY Style Pepperoni Pizza");
	  setDough("Thin Crust Dough");
	  setSauce("Marinara Sauce");
	  setToppings(Lists.newArrayList("Grated Reggiano Cheese", "Sliced Pepperoni", "Garlic", "Onion", "Mushrooms", "Red Pepper"));
	}
}
