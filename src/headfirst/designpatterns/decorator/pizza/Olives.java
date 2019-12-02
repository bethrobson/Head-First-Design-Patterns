package headfirst.designpatterns.decorator.pizza;

public class Olives extends ToppingDecorator {
	
 
	public Olives(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Olives";
	}
 
	public double cost() {
		return pizza.cost() + .30; 
	}
}
