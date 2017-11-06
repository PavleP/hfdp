package a04_factory.f1_simplefactory.pizza;

import com.google.common.collect.Lists;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
    setName("Pepperoni Pizza");
    setDough("Crust");
    setSauce("Marinara sauce");
    setToppings(Lists.newArrayList("Sliced Pepperoni", "Sliced Onion", "Grated parmesan cheese"));
	}
}
