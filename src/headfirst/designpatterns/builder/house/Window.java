package headfirst.designpatterns.builder.house;

public class Window {
	String name;
	String material;
	
	public Window(String material) {
		this.name = "Window made out of " + material;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}

 
 
