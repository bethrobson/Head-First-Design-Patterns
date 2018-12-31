package decorator.starbuzzWithSizes;

import decorator.starbuzzWithSizes.Beverage.Size;

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Beverage beverage = new DarkRoast();
		System.out.println("Plain beverage 1: 	 " + beverage.getDescription()
				+ " $" + String.format("%.2f", beverage.cost()));
 
		Beverage beverage2 = new DarkRoast();
		Mocha mocha = new Mocha(beverage2);
		Mocha mocha2 = new Mocha(mocha);
		Whip whip = new Whip(mocha2);
		// note that getDescription delegates to the wrapped instance
		System.out.println("Decorated beverage 1:  " + whip.getDescription()
				+ " $" + String.format("%.2f", whip.cost()));

		Beverage beverage0 = new Espresso();
		System.out.println("Plain beverage 2: 	 " + beverage0.getDescription()
				+ "  $" + String.format("%.2f", beverage0.cost()));


		Beverage beverage3 = new Espresso();
		beverage3.setSize(Size.VENTI);
		beverage3 = new Cinnamon(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Soy(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println("Decorated beverage 2:  " + beverage3.getDescription()
				+ " $" + String.format("%.2f", beverage3.cost()));


	}


}
