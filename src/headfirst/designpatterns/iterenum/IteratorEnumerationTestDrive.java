package headfirst.designpatterns.iterenum;

import java.util.*;

public class IteratorEnumerationTestDrive {
	public static void main (String args[]) {
		ArrayList<String> l = new ArrayList<String>(Arrays.asList(args));
		Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
