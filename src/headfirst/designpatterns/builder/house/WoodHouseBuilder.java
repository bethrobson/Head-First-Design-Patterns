package headfirst.designpatterns.builder.house;

import headfirst.designpatterns.builder.house.HouseBuilder.HouseType;

public class WoodHouseBuilder extends HouseBuilder {
	int numWalls = 6;     // 4 exterior walls, 2 interior
	int numWindows = 10;  
	String windowMaterial = "Tempered glass";
	String wallMaterial = "Wood, 4x6";
	String interiorWallMaterial = "Wood, 2x4";
	String roofMaterial = "Metal";
	public WoodHouseBuilder() {
		this.builderName = "Wood House Builder";
		setHouseType(HouseType.WOOD);
	}
	public HouseBuilder addWalls() {
		// add exterior walls
		for (int i = 0; i < 4; i++) {
			house.addWall(new Wall(wallMaterial));
		}
		// add interior walls
		for (int i = 0; i < numWalls - 4; i++) {
			house.addWall(new InteriorWall(interiorWallMaterial));
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