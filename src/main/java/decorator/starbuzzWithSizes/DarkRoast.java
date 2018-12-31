package decorator.starbuzzWithSizes;

public class DarkRoast extends Beverage {
	DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

