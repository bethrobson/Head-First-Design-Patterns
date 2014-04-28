package headfirst.designpatterns.combining.composite;

public class DecoyDuck implements Quackable {
 
	public void quack() {
		System.out.println("<< Silence >>");
	}
 
	public String toString() {
		return "Decoy Duck";
	}
}
