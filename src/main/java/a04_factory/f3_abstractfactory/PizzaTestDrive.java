package a04_factory.f3_abstractfactory;

import a04_factory.f3_abstractfactory.pizza.Pizza;
import a04_factory.f3_abstractfactory.pizza.PizzaType;
import a04_factory.f3_abstractfactory.pizzastore.ChicagoPizzaStore;
import a04_factory.f3_abstractfactory.pizzastore.NYPizzaStore;
import a04_factory.f3_abstractfactory.pizzastore.PizzaStore;
public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(PizzaType.CLAM);
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza(PizzaType.CLAM);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(PizzaType.PEPPERONI);
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza(PizzaType.PEPPERONI);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(PizzaType.VEGGIE);
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza(PizzaType.VEGGIE);
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
