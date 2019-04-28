package headfirst.designpatterns.factory.challenge;

import java.util.*;

public class CalendarTestDrive {
 
	public static void main(String[] args) {
		ZoneFactory zoneFactory = new ZoneFactory();
		Calendar calendar = new PacificCalendar(zoneFactory);
		List<String> appts = Arrays.asList("appt 1", "appt 2");
		calendar.createCalendar(appts);
		calendar.print();
	}
}
