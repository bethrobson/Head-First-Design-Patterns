package headfirst.designpatterns.builder.vacation;

import java.util.*;

public class Vacation {
	String name;
	List<Accommodation> accommodations = new ArrayList<Accommodation>();
	List<String> events = new ArrayList<String>();
 
	public void setName(String name) {
		this.name = name;
	}
	public void setAccommodations(List<Accommodation> accommodations) {
		this.accommodations = accommodations;
	}
	public void setEvents(List<String> events) {
		this.events = events;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + this.name + " ----\n");
		for (Accommodation a : accommodations) {
			display.append(a);
		}
		for (String e : events) {
			display.append(e + "\n");
		}
		return display.toString();
	}
}

 
 
