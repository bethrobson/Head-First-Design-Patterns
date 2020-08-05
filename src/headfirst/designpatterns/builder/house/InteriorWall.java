package headfirst.designpatterns.builder.house;

public class InteriorWall extends Wall {
	String name;
	String material;
	
	public InteriorWall(String material) {
		super(material);
		this.name = "Interior wall made out of " + material;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}

 
 
