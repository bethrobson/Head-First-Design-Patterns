package headfirst.designpatterns.prototype;

public class Dragon extends Monster {
	public Dragon(String name, boolean hasWings) {
		super(name);
		this.hasWings = hasWings;
	}
	// Each concrete monster could determine how best to clone itself
	public Monster copy() throws CloneNotSupportedException {
		return (Monster)this.clone();
	}
}