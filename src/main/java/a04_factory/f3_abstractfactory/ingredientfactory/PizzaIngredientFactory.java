package a04_factory.f3_abstractfactory.ingredientfactory;

import a04_factory.f3_abstractfactory.ingredient.cheese.Cheese;
import a04_factory.f3_abstractfactory.ingredient.clams.Clams;
import a04_factory.f3_abstractfactory.ingredient.dough.Dough;
import a04_factory.f3_abstractfactory.ingredient.pepperoni.Pepperoni;
import a04_factory.f3_abstractfactory.ingredient.sauce.Sauce;
import a04_factory.f3_abstractfactory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
 
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
}
