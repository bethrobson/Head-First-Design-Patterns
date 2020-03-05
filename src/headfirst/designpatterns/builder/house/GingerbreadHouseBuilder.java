package headfirst.designpatterns.builder.house;

import headfirst.designpatterns.builder.house.HouseBuilder.HouseType;

public class GingerbreadHouseBuilder extends HouseBuilder {
	int numWalls = 4;
	int numWindows = 4;
	String windowMaterial = "Sugar";
	String wallMaterial = "Gingerbread";
	String roofMaterial = "Twizzlers";
	public GingerbreadHouseBuilder() {
		this.builderName = "Gingerbread House Builder";
		setHouseType(HouseType.GINGERBREAD);
	}
	public HouseBuilder addWalls() {
		// add exterior walls
		for (int i = 0; i < numWalls; i++) {
			house.addWall(new Wall(wallMaterial));
		}
		return this;
	}
	public HouseBuilder addWindows() {
		for (int i = 0; i < numWindows; i++) {
			house.addWindow(new Window(windowMaterial));
		}
		return this;
	}
	public HouseBuilder addRoof() {
		house.addRoof(new Roof(roofMaterial));
		return this;
	}
}