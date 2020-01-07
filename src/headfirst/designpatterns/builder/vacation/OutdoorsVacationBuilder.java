package headfirst.designpatterns.builder.vacation;

import java.time.LocalDate;

public class OutdoorsVacationBuilder extends VacationBuilder {	
	public OutdoorsVacationBuilder() {
		this.name = "Outdoorsy Vacation Builder";
	}
	public VacationBuilder addAccommodation() {
		this.accommodations.add(new Tent());
		return this;
	}
	public VacationBuilder addAccommodation(String name) {
		this.accommodations.add(new Tent(name));
		return this;
	}
	public VacationBuilder addAccommodation(String name, int year, int month, int day, int nights, int location) {
		Reservation reservation = new Reservation();
		reservation.setArrivalDate(year, month, day);
		reservation.setNights(nights);
		
		Tent tent = new Tent(name);
		tent.setReservation(reservation);
		tent.setSiteNumber(location);
		this.accommodations.add(tent);
		return this;
	}
	public VacationBuilder addEvent(String event) {
		this.events.add("Hike: " + event);
		return this;
	}
}