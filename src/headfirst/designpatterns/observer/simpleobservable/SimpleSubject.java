package headfirst.designpatterns.observer.simpleobservable;

import java.util.Observable;

public class SimpleSubject extends Observable {
	private int value = 0;
	
	public SimpleSubject() { }
	
	public void setValue(int value) {
		this.value = value;
		setChanged();
		notifyObservers(value);
	}
	
	public int getValue() {
		return this.value;
	}
}