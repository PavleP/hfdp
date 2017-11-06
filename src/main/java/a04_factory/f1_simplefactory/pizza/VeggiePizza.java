package a04_factory.f1_simplefactory.pizza;

import com.google.common.collect.Lists;

public class VeggiePizza extends Pizza {
	public VeggiePizza() {
      setName("Veggie Pizza");
      setDough("Crust");
      setSauce("Marinara sauce");
      setToppings(Lists.newArrayList("Shredded mozzarella", "Grated parmesan", "Diced onion", "Sliced mushrooms", "Sliced red pepper", "Sliced black olives"));
	}
}
