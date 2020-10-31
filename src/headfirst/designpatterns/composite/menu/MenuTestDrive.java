package headfirst.designpatterns.composite.menu; 

public class MenuTestDrive {
	public static void main(String args[]) {
		MenuComponent pancakeHouseMenu = 
			new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = 
			new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = 
			new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = 
			new Menu("DESSERT MENU", "Dessert of course!");
		MenuComponent coffeeMenu = new Menu("COFFEE MENU", "Stuff to go with your afternoon coffee");
  
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
  
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
  
		pancakeHouseMenu.add(new MenuItem(
			"K&B's Pancake Breakfast", 
			"Pancakes with scrambled eggs and toast", 
			true,
			2.99));
		pancakeHouseMenu.add(new MenuItem(
			"Regular Pancake Breakfast", 
			"Pancakes with fried eggs, sausage", 
			false,
			2.99));
		pancakeHouseMenu.add(new MenuItem(
			"Blueberry Pancakes",
			"Pancakes made with fresh blueberries, and blueberry syrup",
			true,
			3.49));
		pancakeHouseMenu.add(new MenuItem(
			"Waffles",
			"Waffles with your choice of blueberries or strawberries",
			true,
			3.59));

		dinerMenu.add(new MenuItem(
			"Vegetarian BLT",
			"(Fakin') Bacon with lettuce & tomato on whole wheat", 
			true, 
			2.99));
		dinerMenu.add(new MenuItem(
			"BLT",
			"Bacon with lettuce & tomato on whole wheat", 
			false, 
			2.99));
		dinerMenu.add(new MenuItem(
			"Soup of the day",
			"A bowl of the soup of the day, with a side of potato salad", 
			false, 
			3.29));
		dinerMenu.add(new MenuItem(
			"Hot Dog",
			"A hot dog, with saurkraut, relish, onions, topped with cheese",
			false, 
			3.05));
		dinerMenu.add(new MenuItem(
			"Steamed Veggies and Brown Rice",
			"Steamed vegetables over brown rice", 
			true, 
			3.99));
 
		dinerMenu.add(new MenuItem(
			"Pasta",
			"Spaghetti with marinara sauce, and a slice of sourdough bread",
			true, 
			3.89));
   
		dinerMenu.add(dessertMenu);
  
		dessertMenu.add(new MenuItem(
			"Apple Pie",
			"Apple pie with a flakey crust, topped with vanilla icecream",
			true,
			1.59));
  
		dessertMenu.add(new MenuItem(
			"Cheesecake",
			"Creamy New York cheesecake, with a chocolate graham crust",
			true,
			1.99));
		dessertMenu.add(new MenuItem(
			"Sorbet",
			"A scoop of raspberry and a scoop of lime",
			true,
			1.89));

		cafeMenu.add(new MenuItem(
			"Veggie Burger and Air Fries",
			"Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
			true, 
			3.99));
		cafeMenu.add(new MenuItem(
			"Soup of the day",
			"A cup of the soup of the day, with a side salad",
			false, 
			3.69));
		cafeMenu.add(new MenuItem(
			"Burrito",
			"A large burrito, with whole pinto beans, salsa, guacamole",
			true, 
			4.29));

		cafeMenu.add(coffeeMenu);

		coffeeMenu.add(new MenuItem(
			"Coffee Cake",
			"Crumbly cake topped with cinnamon and walnuts",
			true,
			1.59));
		coffeeMenu.add(new MenuItem(
			"Bagel",
			"Flavors include sesame, poppyseed, cinnamon raisin, pumpkin",
			false,
			0.69));
		coffeeMenu.add(new MenuItem(
			"Biscotti",
			"Three almond or hazelnut biscotti cookies",
			true,
			0.89));
 
		Waitress waitress = new Waitress(allMenus);
   
		waitress.printMenu();
	}
}
