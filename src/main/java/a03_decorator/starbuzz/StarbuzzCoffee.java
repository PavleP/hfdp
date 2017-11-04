package a03_decorator.starbuzz;

import a03_decorator.starbuzz.coffee.DarkRoast;
import a03_decorator.starbuzz.coffee.Espresso;
import a03_decorator.starbuzz.coffee.HouseBlend;
import a03_decorator.starbuzz.condiment.Mocha;
import a03_decorator.starbuzz.condiment.Soy;
import a03_decorator.starbuzz.condiment.Whip;

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " $" + espresso.getCost());

    Beverage darkRoast = new DarkRoast();
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Whip(darkRoast);
    System.out.println(darkRoast.getDescription() + " $" + darkRoast.getCost());
 
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		System.out.println(houseBlend.getDescription() + " $" + houseBlend.getCost());
	}
}
