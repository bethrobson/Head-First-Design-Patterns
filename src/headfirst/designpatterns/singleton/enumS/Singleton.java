package headfirst.designpatterns.singleton.enumS;

public enum Singleton {
	UNIQUE_INSTANCE;
 
	// other useful fields here

	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
