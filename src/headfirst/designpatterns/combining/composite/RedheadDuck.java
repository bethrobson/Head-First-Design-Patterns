package headfirst.designpatterns.combining.composite;

public class RedheadDuck implements Quackable {
	public void quack() {
		System.out.println("Quack");
	}

	public String toString() {
		return "Redhead Duck";
	}
}
