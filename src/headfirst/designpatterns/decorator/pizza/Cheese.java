package headfirst.designpatterns.decorator.pizza;

public class Cheese extends ToppingDecorator {
	
 
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Cheese";
	}
 
	public double cost() {
		return pizza.cost(); // cheese is free
	}
}
