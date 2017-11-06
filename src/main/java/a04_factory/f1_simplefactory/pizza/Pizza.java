package a04_factory.f1_simplefactory.pizza;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
public abstract class Pizza {

	@Getter
  private String name;
  private String dough;
  private String sauce;
  private List<String> toppings;

  public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
	}

	public void bake() {
		System.out.println("Baking " + name);
	}

	public void cut() {
		System.out.println("Cutting " + name);
	}

	public void box() {
		System.out.println("Boxing " + name);
	}

  @Override
	public String toString() {
		// code to display pizza name and ingredients
		StringBuilder display = new StringBuilder();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}

