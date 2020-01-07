package headfirst.designpatterns.builder.vacation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class VacationBuilder {
	String name;
	List<Accommodation> accommodations = new ArrayList<Accommodation>();
	List<String> events = new ArrayList<String>();
	
	public abstract VacationBuilder addAccommodation();
	public abstract VacationBuilder addAccommodation(String name);
	public abstract VacationBuilder addAccommodation(String name, int year, int month, int day, int nights, int location);
	public abstract VacationBuilder addEvent(String event);
	
	public Vacation getVacation() {
		Vacation vacation = new Vacation();
		vacation.setName(name);
		vacation.setAccommodations(accommodations);
		vacation.setEvents(events);
		return vacation;
	}
}