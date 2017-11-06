package a04_factory.f3_abstractfactory.pizza;

import a04_factory.f3_abstractfactory.ingredient.cheese.Cheese;
import a04_factory.f3_abstractfactory.ingredient.clams.Clams;
import a04_factory.f3_abstractfactory.ingredient.dough.Dough;
import a04_factory.f3_abstractfactory.ingredient.pepperoni.Pepperoni;
import a04_factory.f3_abstractfactory.ingredient.sauce.Sauce;
import a04_factory.f3_abstractfactory.ingredient.veggies.Veggies;
import lombok.Getter;
import lombok.Setter;

@Setter
public abstract class Pizza {

  @Getter
	private String name;
  private Dough dough;
  private Sauce sauce;
  private Veggies veggies[];
  private Cheese cheese;
  private Pepperoni pepperoni;
  private Clams clam;

  public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

  public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

  public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
