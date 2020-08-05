package headfirst.designpatterns.builder.house;

import java.util.ArrayList;
import java.util.List;

public abstract class HouseBuilder {
	String builderName;
	enum HouseType {
		STONE, WOOD, GINGERBREAD
	}
	HouseType houseType;
	House house = new House();
	
	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
		house.setHouseType(houseType);
	}
	// Each method in the Builder returns the Builder so we can use the Fluent Interface Pattern
	public abstract HouseBuilder addWalls();
	public abstract HouseBuilder addRoof();
	public abstract HouseBuilder addWindows();

	public House build() {
		System.out.println("Build the house!");
		// Very simple build -- just return the house!
		// We've added all the parts... 
		// In a real build, we'd have to nail and screw everything together of course.
		// And add wiring and so on.
		return house;
	}
}