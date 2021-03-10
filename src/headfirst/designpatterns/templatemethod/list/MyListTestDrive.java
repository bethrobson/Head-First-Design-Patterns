package headfirst.designpatterns.templatemethod.list;

import java.util.List;

public class MyListTestDrive {
 
	public static void main(String[] args) {
		String[] ducks = { "Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
		MyStringList ducksList = new MyStringList(ducks);
		for (int i = 0; i < ducksList.size(); i++) {
			System.out.println(ducksList.get(i));
		}
		String oldDuck = ducksList.set(3, "Donald Duck");
		System.out.println("Replacing " + oldDuck);
		System.out.println("New List:");
		for (int i = 0; i < ducksList.size(); i++) {
			System.out.println(ducksList.get(i));
		}
		// Now the real test... subList()
		List ducksSubList = ducksList.subList(2, 3);
		System.out.println("Created a sub list of ducks, with size: " + ducksSubList.size());
		for (int i = 0; i < ducksSubList.size(); i++) {
			System.out.println(ducksSubList.get(i));
		}
	}
}