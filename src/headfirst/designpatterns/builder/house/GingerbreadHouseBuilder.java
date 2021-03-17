package headfirst.designpatterns.builder.house;

public class GingerbreadHouseBuilder extends HouseBuilder {
	int numWalls = 4;
	int numWindows = 4;
	String windowMaterial = "Sugar";
	String wallMaterial = "Gingerbread and icing";
	String roofMaterial = "Twizzlers";
	public GingerbreadHouseBuilder() {
		this.builderName = "Gingerbread House Builder";
		setHouseType(HouseType.GINGERBREAD);
	}
	public HouseBuilder addWalls() {
		// add exterior walls
		for (int i = 0; i < numWalls; i++) {
			System.out.println("Adding wall made out of " + wallMaterial);
			house.addWall(new Wall(wallMaterial));
		}
		return this;
	}
	public HouseBuilder addWindows() {
		for (int i = 0; i < numWindows; i++) {
			System.out.println("Adding window made out of " + windowMaterial);
			house.addWindow(new Window(windowMaterial));
		}
		return this;
	}
	public HouseBuilder addRoof() {
		house.addRoof(new Roof(roofMaterial));
		return this;
	}
	public House build() {
		System.out.println("Stick everything together with icing");
		return house;
	}
}