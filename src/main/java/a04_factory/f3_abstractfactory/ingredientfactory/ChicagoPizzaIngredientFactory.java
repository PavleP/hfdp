package a04_factory.f3_abstractfactory.ingredientfactory;

import a04_factory.f3_abstractfactory.ingredient.veggies.BlackOlives;
import a04_factory.f3_abstractfactory.ingredient.cheese.Cheese;
import a04_factory.f3_abstractfactory.ingredient.clams.Clams;
import a04_factory.f3_abstractfactory.ingredient.dough.Dough;
import a04_factory.f3_abstractfactory.ingredient.veggies.Eggplant;
import a04_factory.f3_abstractfactory.ingredient.clams.FrozenClams;
import a04_factory.f3_abstractfactory.ingredient.cheese.MozzarellaCheese;
import a04_factory.f3_abstractfactory.ingredient.pepperoni.Pepperoni;
import a04_factory.f3_abstractfactory.ingredient.sauce.PlumTomatoSauce;
import a04_factory.f3_abstractfactory.ingredient.sauce.Sauce;
import a04_factory.f3_abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import a04_factory.f3_abstractfactory.ingredient.veggies.Spinach;
import a04_factory.f3_abstractfactory.ingredient.dough.ThickCrustDough;
import a04_factory.f3_abstractfactory.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
		return new ThickCrustDough();
	}

  @Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

  @Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

  @Override
	public Veggies[] createVeggies() {
    return new Veggies[] { new BlackOlives(), new Spinach(), new Eggplant() };
	}

  @Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

  @Override
	public Clams createClam() {
		return new FrozenClams();
	}
}
