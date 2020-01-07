package headfirst.designpatterns.command.diner;

public class Diner {
	public static void main(String[] args) {
		Cook cook = new Cook();
		Waitress waitress = new Waitress();
		Customer customer = new Customer(waitress);
		
		Order o = () -> { cook.makeBurger(); cook.makeFries(); };
		customer.hungry(o);
	}
}