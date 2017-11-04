package a03_decorator.starbuzzWithSizes;

import a03_decorator.starbuzzWithSizes.coffee.DarkRoast;
import a03_decorator.starbuzzWithSizes.coffee.Espresso;
import a03_decorator.starbuzzWithSizes.coffee.HouseBlend;
import a03_decorator.starbuzzWithSizes.condiment.Mocha;
import a03_decorator.starbuzzWithSizes.condiment.Soy;
import a03_decorator.starbuzzWithSizes.condiment.Whip;

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " $" + String.format("%.2f", espresso.getCost()));

    Beverage darkRoast = new DarkRoast();
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Whip(darkRoast);
    System.out.println(darkRoast.getDescription() + " $" + String.format("%.2f", darkRoast.getCost()));
 
		Beverage houseBlend = new HouseBlend();
		houseBlend.setSize(Size.VENTI);
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
    System.out.println(houseBlend.getDescription() + " $" + String.format("%.2f", houseBlend.getCost()));
	}
}
