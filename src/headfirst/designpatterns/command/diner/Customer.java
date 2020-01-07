package headfirst.designpatterns.command.diner;

public class Customer {
	Waitress waitress;
	public Customer(Waitress waitress) {
		this.waitress = waitress;
	}
	public void hungry(Order o) {
		waitress.takeOrder(o);
	}
}