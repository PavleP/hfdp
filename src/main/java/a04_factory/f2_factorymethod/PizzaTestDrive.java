package a04_factory.f2_factorymethod;

import a04_factory.f2_factorymethod.pizza.Pizza;
import a04_factory.f2_factorymethod.pizza.PizzaType;
import a04_factory.f2_factorymethod.pizzastore.ChicagoPizzaStore;
import a04_factory.f2_factorymethod.pizzastore.NYPizzaStore;
import a04_factory.f2_factorymethod.pizzastore.PizzaStore;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza(PizzaType.CLAM);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza(PizzaType.CLAM);
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza(PizzaType.PEPPERONI);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza(PizzaType.PEPPERONI);
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza(PizzaType.VEGGIE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza(PizzaType.VEGGIE);
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
