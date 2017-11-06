package a04_factory.f2_factorymethod.pizza.chicago;

import com.google.common.collect.Lists;

import a04_factory.f2_factorymethod.pizza.Pizza;

public class ChicagoStyleClamPizza extends Pizza {

  public ChicagoStyleClamPizza() {
    setName("Chicago Style Clam Pizza");
    setDough("Extra Thick Crust Dough");
    setSauce("Plum Tomato Sauce");
    setToppings(Lists.newArrayList("Shredded Mozzarella Cheese", "Frozen Clams from Chesapeake Bay"));
	}
 
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
