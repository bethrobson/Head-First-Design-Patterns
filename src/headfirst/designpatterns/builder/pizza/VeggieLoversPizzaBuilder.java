package headfirst.designpatterns.builder.pizza;

public class VeggieLoversPizzaBuilder extends PizzaBuilder {
	public VeggieLoversPizzaBuilder() {
		this.name = "Veggie Lovers Pizza";
	}
	public PizzaBuilder addCheese() {
		// veggie lovers like parm
		this.toppings.add("parmesan");
		return this;
	}
	public PizzaBuilder addSauce() {
		this.toppings.add("sauce");
		return this;
	}
	public PizzaBuilder addTomatoes() {
		this.toppings.add("chopped tomatoes");
		return this;
	}
	public PizzaBuilder addGarlic() {
		this.toppings.add("garlic");
		return this;
	}
	public PizzaBuilder addOlives() {
		this.toppings.add("green olives");
		return this;
	}
	public PizzaBuilder addSpinach() {
		this.toppings.add("spinach");
		return this;
	}
	public PizzaBuilder addPepperoni() {
		// never EVER add Pepperoni to veggie lovers pizza
		return this;
	}
	public PizzaBuilder addSausage() {
		// never EVER add Sausage to veggie lovers pizza
		return this;
	}
	
}