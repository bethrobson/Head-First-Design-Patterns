package headfirst.designpatterns.singleton.subclass;

public class Singleton {
	protected static Singleton uniqueInstance;
 
	// other useful instance variables here
 
	protected Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
}
