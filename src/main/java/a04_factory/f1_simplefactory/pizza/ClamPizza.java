package a04_factory.f1_simplefactory.pizza;

import com.google.common.collect.Lists;

public class ClamPizza extends Pizza {
	public ClamPizza() {
    setName("Clam Pizza");
    setDough("Thin Crust");
    setSauce("White garlic sauce");
    setToppings(Lists.newArrayList("Clams", "Grated parmesan cheese"));
	}
}
