package a04_factory.f1_simplefactory.pizza;

import com.google.common.collect.Lists;

public class CheesePizza extends Pizza {
	public CheesePizza() {
	  setName("Cheese Pizza");
	  setDough("Regular Crust");
	  setSauce("Marinara Pizza Sauce");
	  setToppings(Lists.newArrayList("Fresh Mozzarella", "Parmesan"));
	}
}
