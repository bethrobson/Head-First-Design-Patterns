package headfirst.designpatterns.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}
