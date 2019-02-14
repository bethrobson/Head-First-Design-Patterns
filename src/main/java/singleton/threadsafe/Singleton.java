package headfirst.designpatterns.singleton.threadsafe;

public class Singleton {
	private static Singleton uniqueInstance;
 
	// other useful instance variables here
 
	private Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
