package headfirst.designpatterns.collections.iterator;

public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	String[] menuItems;
  
	public DinerMenu() {
		menuItems = new String[MAX_ITEMS];
 
		addItem("Vegetarian BLT");
		addItem("BLT");
		addItem("Soup of the day");
		addItem("Hotdog");
		addItem("Steamed Veggies and Brown Rice");
		addItem("Pasta");
	}
  
	public void addItem(String name) 
	{
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = name;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public String[] getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
 
	public String toString() {
		return "Diner Menu";
	}
	// other menu methods here
}
