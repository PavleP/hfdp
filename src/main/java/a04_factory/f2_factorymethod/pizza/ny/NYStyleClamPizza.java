package a04_factory.f2_factorymethod.pizza.ny;

import com.google.common.collect.Lists;

import a04_factory.f2_factorymethod.pizza.Pizza;

public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
	  setName("NY Style Clam Pizza");
	  setDough("Thin Crust Dough");
	  setSauce("Marinara Sauce");
	  setToppings(Lists.newArrayList("Grated Reggiano Cheese", "Fresh Clams from Long Island Sound"));
	}
}
