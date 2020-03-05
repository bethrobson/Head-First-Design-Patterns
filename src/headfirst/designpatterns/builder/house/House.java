package headfirst.designpatterns.builder.house;

import headfirst.designpatterns.builder.house.HouseBuilder.HouseType;
import java.util.*;

public class House {
	String name;
	HouseType houseType;
	Roof roof;
	List<Wall> walls;
	List<Window> windows;
	
	public House() {
		this.walls = new ArrayList<Wall>();
		this.windows = new ArrayList<Window>();
	}
	public House setHouseType(HouseType houseType) {
		this.houseType = houseType;
		switch (houseType) {
			case STONE: this.name = "My stone house";
			case WOOD: this.name = "My wood house";
			case GINGERBREAD: this.name = "My holiday gingerbread house";
		}
		return this;
	}
	House addRoof(Roof roof) {
		this.roof = roof;
		return this;
	}
	House addWall(Wall wall) {
		this.walls.add(wall);
		return this;
	}
	House addWindow(Window window) {
		this.windows.add(window);
		return this;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		// Use a StringBuilder to build the string :-)
		// Like StringBuffer, but not synchronized
		StringBuilder display = new StringBuilder();
		display.append("---- " + this.name + " ----\n");
		for (Wall wall : walls) {
			display.append("--- " + wall.name + " ---\n");
		}
		for (Window window : windows) {
			display.append("--- " + window.name + " ---\n");
		}
		display.append("--- " + roof.name + " ---\n");
		return display.toString();
		
		// There is some difference of opinion about StringBuilder and whether it's using
		// the Builder pattern or not. Some say yes, some say no.
		// StringBuilder does not provide an abstract API with multiple subclasses for
		//   creating different representations (variations).
	}
}

 
 
