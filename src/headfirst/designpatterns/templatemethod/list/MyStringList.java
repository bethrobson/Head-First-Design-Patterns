package headfirst.designpatterns.templatemethod.list;

import java.util.AbstractList;

// AbstractList provides a skeletal implementation of the List interface 
// to minimize the effort required to implement this interface backed by 
// a "random access" data store (such as an array). 

// To implement an unmodifiable list, the programmer needs only to extend 
// this class and provide implementations for the get(int) and size() methods.
// get(int index) is an abstract method in AbstractList
// size() is an abstract method in AbstractCollection
// subList(int fromIndex, int toIndex) returns a view of the portion of this list 
// between the specified fromIndex, inclusive, and toIndex, exclusive.

public class MyStringList extends AbstractList<String> {
	private String[] myList;
	MyStringList(String[] strings) {
		myList = strings;
	}
	@Override
	public String get(int index) {
		return myList[index];
	}
	@Override
	public String set(int index, String item) {
		String oldString = myList[index];
		myList[index] = item;
		return oldString;
	}
	@Override
	public int size() {
		return myList.length;
	}
}