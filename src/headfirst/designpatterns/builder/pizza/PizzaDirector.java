package headfirst.designpatterns.builder.pizza;

public class PizzaDirector {
 
	// Fluent Interface pattern (return the builder each time so we can string the calls together)
	// Builder pattern (we have two different builders so the "same construction process can create
	//   different representations").
	// Builder is a solution to the telescoping constructor anti-pattern, where we have multiple,
	//   complex constructor methods with various args for all various combinations of options
	//   in construction options. 
	
	// in this example main() is the construct() method
	public static void main(String[] args) {
		// Could hand builders to PizzaStore which would take the customer's order,
		//   and call appropriate methods for each topping, then call the
		//   pizza methods to prep and return to the customer. 
		PizzaBuilder veggieBuilder = new VeggieLoversPizzaBuilder();
		// The PizzaDirector calls the methods in the correct order to
		// build a veggiePizza. 
		Pizza veggie = veggieBuilder.addSauce().addCheese().addOlives().addTomatoes().addSausage().build();
		veggie.prepare();
		veggie.bake();
		veggie.cut();
		veggie.box();
		System.out.println(veggie);
		
		PizzaBuilder meatBuilder = new MeatLoversPizzaBuilder();
		// The PizzaDirector calls the methods in the correct order to build
		// a meat lovers Pizza
		Pizza meat = meatBuilder.addSauce().addTomatoes().addCheese().addSausage().addPepperoni().build();
		meat.prepare();
		meat.bake();
		meat.cut();
		meat.box();
		System.out.println(meat);
		
		// There is some difference of opinion about StringBuilder and whether it's using
		// the Builder pattern or not. Some say yes, some say no.
		// StringBuilder does not provide an abstract API with multiple subclasses for
		//   creating different representations (variations). So, strictly, no, it doesn't 
		//   use the Builder Pattern, but rather the Fluent Interface Pattern.
		StringBuilder sb = new StringBuilder();
		sb.append("\nTesting String Builder\n").append(veggie).insert(0, "====");
		System.out.println("Length of the String Builder: " + sb.length()); 
		System.out.println("Result of the String Builder: " + sb.toString());
		
		String sb2 = new StringBuilder().append("\nTesting String Builder\n").append(meat).insert(0, "====").toString();
		System.out.println(sb2);
		
		// Builder has similarities to Abstract Factory.
		// But difference is that Builder provides a step by step API for building a product;
		//   the client is responsible for calling the steps, and those can vary in order, etc.
		//   With Builder, the client must have more knowledge of the details of the product being built.
		// Product implementations can be swapped for others; clients don't change because the use the abstract API.
	}
}
