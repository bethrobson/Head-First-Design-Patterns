package headfirst.designpatterns.builder.vacation;

public class VacationDirector {
	public static void main(String[] args) {
		VacationBuilder outdoorsyVacationBuilder = new OutdoorsVacationBuilder();
		Vacation outdoorsyVacation = outdoorsyVacationBuilder
				.addAccommodation("Two person tent", 2020, 7, 1, 5, 34)
				.addEvent("Beach")
				.addAccommodation("Two person tent")
				.addEvent("Mountains")
				.getVacation();
		System.out.println(outdoorsyVacation);
		
		VacationBuilder cityVacationBuilder = new CityVacationBuilder();
		Vacation cityVacation = cityVacationBuilder
				.addAccommodation("Grand Facadian", 2020, 8, 1, 5, 0)
				.addAccommodation("Hotel Commander", 2020, 8, 6, 2, 0)
				.addEvent("Cirque du Soleil")
				.getVacation();
		System.out.println(cityVacation);
	}
}
