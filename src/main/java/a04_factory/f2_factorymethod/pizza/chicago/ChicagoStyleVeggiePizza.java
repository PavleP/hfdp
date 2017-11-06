package a04_factory.f2_factorymethod.pizza.chicago;

import com.google.common.collect.Lists;

import a04_factory.f2_factorymethod.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

	public ChicagoStyleVeggiePizza() {
	  setName("Chicago Deep Dish Veggie Pizza");
	  setDough("Extra Thick Crust Dough");
	  setSauce("Plum Tomato Sauce");
	  setToppings(Lists.newArrayList("Shredded Mozzarella Cheese", "Black Olives", "Spinach", "Eggplant"));
	}
 
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
