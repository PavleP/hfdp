package a04_factory.f1_simplefactory;

import a04_factory.f1_simplefactory.pizza.Pizza;
import a04_factory.f1_simplefactory.pizza.PizzaType;
public class PizzaTestDrive {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza(PizzaType.CHEESE);
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
		pizza = store.orderPizza(PizzaType.VEGGIE);
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}
}
