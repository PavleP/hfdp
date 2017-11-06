package a04_factory.f3_abstractfactory.pizza;

import a04_factory.f3_abstractfactory.ingredientfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	private PizzaIngredientFactory ingredientFactory;
 
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	@Override
	public void prepare() {
		System.out.println("Preparing " + getName());
		setDough(ingredientFactory.createDough());
		setSauce(ingredientFactory.createSauce());
		setCheese(ingredientFactory.createCheese());
	}
}
