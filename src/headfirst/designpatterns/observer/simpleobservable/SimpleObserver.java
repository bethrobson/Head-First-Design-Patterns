package headfirst.designpatterns.observer.simpleobservable;

import java.util.Observable;
import java.util.Observer;
	
public class SimpleObserver implements Observer {
	private int value;
	private Observable observable;
	
	public SimpleObserver(Observable observable) {
		this.observable = observable;
		observable.addObserver((Observer) this);
	}
	
	public void display() {
		System.out.println("Value: " + value);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(arg);
		this.value = (int) arg;
		display();
		if (o instanceof SimpleSubject) {
			SimpleSubject simpleSubject = (SimpleSubject)o;
			this.value = simpleSubject.getValue();
			display();
		}
	}
}
