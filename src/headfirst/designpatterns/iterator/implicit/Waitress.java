package headfirst.designpatterns.iterator.implicit;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
 
public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
 
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	// implicit iteration
	public void printMenu() {
		List<MenuItem> breakfastItems = ((PancakeHouseMenu) pancakeHouseMenu).getMenuItems();
		for (MenuItem m : breakfastItems) {
			printMenuItem(m);
		}
		
		MenuItem[] lunchItems = ((DinerMenu) dinerMenu).getMenuItems();
		for (MenuItem m : lunchItems) {
			printMenuItem(m);
		}
	}
	
	public void printMenuItem(MenuItem menuItem) {
		System.out.print(menuItem.getName() + ", ");
		System.out.print(menuItem.getPrice() + " -- ");
		System.out.println(menuItem.getDescription());
	}
}
