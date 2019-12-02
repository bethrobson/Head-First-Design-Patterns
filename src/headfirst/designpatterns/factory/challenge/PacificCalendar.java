package headfirst.designpatterns.factory.challenge;

import java.util.*;

public class PacificCalendar extends Calendar {
	public PacificCalendar(ZoneFactory zoneFactory) {
		zone = zoneFactory.createZone("US/Pacific");
		// make a calendar for the pacific zone
		// ...
	}
	public void createCalendar(List<String> appointments) {
		// make calendar from appointments
		System.out.println("Making the calendar");
	}
}