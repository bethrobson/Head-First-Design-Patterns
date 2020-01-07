package headfirst.designpatterns.builder.vacation;

import java.time.LocalDate;

public class CityVacationBuilder extends VacationBuilder {	
	public CityVacationBuilder() {
		this.name = "City Vacation Builder";
	}
	public VacationBuilder addAccommodation() {
		this.accommodations.add(new Hotel());
		return this;
	}
	public VacationBuilder addAccommodation(String name) {
		this.accommodations.add(new Hotel(name));
		return this;
	}
	public VacationBuilder addAccommodation(String name, int year, int month, int day, int nights, int location) {
		Reservation reservation = new Reservation();
		reservation.setArrivalDate(year, month, day);
		reservation.setNights(nights);
		
		Hotel hotel = new Hotel(name);
		hotel.setReservation(reservation);
		hotel.setRoomNumber(location);
		this.accommodations.add(hotel);
		return this;
	}
	public VacationBuilder addEvent(String event) {
		this.events.add("See the " + event + " show");
		return this;
	}
}