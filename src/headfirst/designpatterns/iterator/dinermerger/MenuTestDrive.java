package headfirst.designpatterns.iterator.dinermerger;

import java.util.*;

public class MenuTestDrive {
	public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		// With iterators
		waitress.printMenu();
		
		printMenus();
	}
	
	/*
	 * Without the Waitress, we need the code below...
	 */
	public static void printMenus() {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
		MenuItem[] lunchItems = dinerMenu.getMenuItems();
		
		// print as Iterable
		printMenu(breakfastItems);
		printMenu(Arrays.asList(lunchItems));
		
		// print with forEach
		System.out.println("=== forEach ===");
		breakfastItems.forEach(item -> System.out.println(item));
		Arrays.asList(lunchItems).forEach(item -> System.out.println(item));
		System.out.println("=== forEach ===");
		
		// Using enhanced for loop
		System.out.println("USING ENHANCED FOR");
		for (MenuItem menuItem : breakfastItems) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
		for (MenuItem menuItem : lunchItems) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
 
		// Exposing implementation
		System.out.println("USING FOR LOOPS");
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}

		for (int i = 0; i < lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
	}
	
	public static void printMenu(Iterable<MenuItem> a) {
		for (MenuItem menuItem : a) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
	}
}
