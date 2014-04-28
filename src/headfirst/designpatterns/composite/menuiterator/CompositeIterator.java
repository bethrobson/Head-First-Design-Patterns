package headfirst.designpatterns.composite.menuiterator;

import java.util.*;
  
public class CompositeIterator implements Iterator<Object> {
	Stack<Iterator<?>> stack = new Stack<Iterator<?>>();
   
	public CompositeIterator(Iterator<?> iterator) {
		stack.push(iterator);
	}
   
	public Object next() {
		if (hasNext()) {
			Iterator<?> iterator = (Iterator<?>) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			stack.push(component.createIterator());
			return component;
		} else {
			return null;
		}
	}
  
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<?> iterator = (Iterator<?>) stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}


