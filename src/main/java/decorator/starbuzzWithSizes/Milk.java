package decorator.starbuzzWithSizes;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", with Milk";
	}

	public double cost() {
		return beverage.cost() + .10;
	}
}
