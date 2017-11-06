package a04_factory.f3_abstractfactory.ingredientfactory;

import a04_factory.f3_abstractfactory.ingredient.cheese.Cheese;
import a04_factory.f3_abstractfactory.ingredient.clams.Clams;
import a04_factory.f3_abstractfactory.ingredient.dough.Dough;
import a04_factory.f3_abstractfactory.ingredient.clams.FreshClams;
import a04_factory.f3_abstractfactory.ingredient.veggies.Garlic;
import a04_factory.f3_abstractfactory.ingredient.sauce.MarinaraSauce;
import a04_factory.f3_abstractfactory.ingredient.veggies.Mushroom;
import a04_factory.f3_abstractfactory.ingredient.veggies.Onion;
import a04_factory.f3_abstractfactory.ingredient.pepperoni.Pepperoni;
import a04_factory.f3_abstractfactory.ingredient.veggies.RedPepper;
import a04_factory.f3_abstractfactory.ingredient.cheese.ReggianoCheese;
import a04_factory.f3_abstractfactory.ingredient.sauce.Sauce;
import a04_factory.f3_abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import a04_factory.f3_abstractfactory.ingredient.dough.ThinCrustDough;
import a04_factory.f3_abstractfactory.ingredient.veggies.Veggies;
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	@Override
  public Dough createDough() {
		return new ThinCrustDough();
	}

  @Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

  @Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

  @Override
	public Veggies[] createVeggies() {
    return new Veggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
	}

  @Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

  @Override
	public Clams createClam() {
		return new FreshClams();
	}
}
