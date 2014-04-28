package headfirst.designpatterns.collections.iterator_builtin;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<String> {
	String[] list;
	int position = 0;
 
	public DinerMenuIterator(String[] list) {
		this.list = list;
	}
 
	public String next() {
		String menuItem = list[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
  
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an item until you've done at least one next()");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}
}
