package headfirst.designpatterns.proxy.javaproxy;
 
import java.lang.reflect.*;
 
public class OwnerInvocationHandler implements InvocationHandler { 
	PersonBean person;
 
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
 
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws IllegalAccessException {
  
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
   			} else if (method.getName().equals("setHotOrNotRating")) {
				throw new IllegalAccessException();
			} else if (method.getName().startsWith("set")) {
				return method.invoke(person, args);
			} 
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}
}
