package headfirst.designpatterns.iterator.dinermerger;

public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
 
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
 
	public MenuItem next() {
		/*
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
		*/
		
		// or shorten to 
		return items[position++];
	}
 
	public boolean hasNext() {
		/*
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
		*/
		
		// or shorten to
		return items.length > position;
	}
}
