package headfirst.designpatterns.singleton.subclass;

public class CoolerSingleton extends Singleton {
	// useful instance variables here
	protected static Singleton uniqueInstance;
 
	private CoolerSingleton() {
		super();
	}
 
	// useful methods here
}
